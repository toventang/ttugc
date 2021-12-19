package com.bytedance.retrofit2.mime;

import com.bytedance.covode.number.Covode;
import java.io.InputStream;

public interface TypedInput {
    static {
        Covode.recordClassIndex(25757);
    }

    /* renamed from: in */
    InputStream mo11577in();

    long length();

    String mimeType();
}
