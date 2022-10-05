package com.example.newsdesk;

import com.example.newsdesk.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener <NewsApiResponse>{

    void onFetchData(List<NewsHeadlines>list,String message);

    void onError(String message);


}
