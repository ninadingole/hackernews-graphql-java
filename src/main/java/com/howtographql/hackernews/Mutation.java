package com.howtographql.hackernews;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

public class Mutation implements GraphQLRootResolver {
    private final LinkRepository linkRepository;

    public Mutation(LinkRepository repository) {
        this.linkRepository = repository;
    }

    public Link createLink(String url, String description) {
        Link link = new Link(url, description);
        linkRepository.saveLink(link);
        return link;
    }
}
