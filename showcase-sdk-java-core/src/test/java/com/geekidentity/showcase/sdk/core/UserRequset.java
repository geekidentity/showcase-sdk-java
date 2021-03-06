package com.geekidentity.showcase.sdk.core;

import com.geekidentity.showcase.sdk.core.request.BaseRequest;

public class UserRequset extends BaseRequest<UserResponse> {

    private String name;
    private String password;

    public UserRequset() {
        super("/user/create", HttpMethodType.GET);
    }

    public void setName(String name) {
        this.name = name;
        if (name != null) {
            putQueryParameter("name", name);
        }
    }

    public void setPassword(String password) {
        this.password = password;
        if (password != null) {
            putQueryParameter("password", password);
        }
    }

    @Override
    public Class<UserResponse> getResponseClass() {
        return UserResponse.class;
    }
}
