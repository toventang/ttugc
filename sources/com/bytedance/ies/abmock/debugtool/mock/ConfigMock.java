package com.bytedance.ies.abmock.debugtool.mock;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.datacenter.p1116a.AbstractC16052a;

public class ConfigMock implements AbstractC16052a {
    public static final ConfigMock INSTANCE = new ConfigMock();

    public void delete(String str) {
    }

    @Override // com.bytedance.ies.abmock.datacenter.p1116a.AbstractC16052a
    public boolean enable() {
        return false;
    }

    @Override // com.bytedance.ies.abmock.datacenter.p1116a.AbstractC16052a
    public Object get(String str) {
        return null;
    }

    public <T> T get(String str, T t) {
        return null;
    }

    public boolean hasMock(String str) {
        return false;
    }

    @Override // com.bytedance.ies.abmock.datacenter.p1116a.AbstractC16052a
    public void init(Context context) {
    }

    public void put(String str, Object obj) {
    }

    private ConfigMock() {
    }

    static {
        Covode.recordClassIndex(18348);
    }
}
