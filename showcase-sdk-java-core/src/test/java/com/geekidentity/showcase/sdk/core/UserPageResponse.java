package com.geekidentity.showcase.sdk.core;

import com.geekidentity.showcase.sdk.core.response.PagedResponse;

import java.util.List;

public class UserPageResponse extends PagedResponse {
    private List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
