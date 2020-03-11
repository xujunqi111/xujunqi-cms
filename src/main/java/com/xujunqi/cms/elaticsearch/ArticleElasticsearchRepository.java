package com.xujunqi.cms.elaticsearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ArticleElasticsearchRepository extends ElasticsearchRepository<ArticleElastic, Integer>{

}
