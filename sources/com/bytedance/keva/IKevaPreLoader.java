package com.bytedance.keva;

import com.bytedance.covode.number.Covode;

public interface IKevaPreLoader {
    static {
        Covode.recordClassIndex(24215);
    }

    void access(String str, int i);

    void preload();
}
