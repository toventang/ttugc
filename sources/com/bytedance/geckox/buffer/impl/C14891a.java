package com.bytedance.geckox.buffer.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.buffer.AbstractC14888a;
import com.bytedance.geckox.p1022i.C14957a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bytedance.geckox.buffer.impl.a */
public final class C14891a {
    static {
        Covode.recordClassIndex(17004);
    }

    /* renamed from: a */
    public static AbstractC14888a m27370a(File file, long j) {
        if (j <= 0) {
            try {
                return new C14892b(file);
            } catch (Exception e) {
                throw new IOException("create FileBuffer failed! file:" + file.getAbsolutePath() + " caused by:" + e.getMessage(), e);
            }
        } else {
            try {
                return new MMapBuffer(j, file);
            } catch (Exception unused) {
                C14957a.m27542a();
                try {
                    return new C14893c(j, file);
                } catch (Exception e2) {
                    throw new RuntimeException("create random access file failed! file:" + file.getAbsolutePath() + " caused by:" + e2.getMessage(), e2);
                }
            }
        }
    }
}
