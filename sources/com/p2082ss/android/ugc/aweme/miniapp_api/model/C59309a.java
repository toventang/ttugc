package com.p2082ss.android.ugc.aweme.miniapp_api.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.a */
public final class C59309a {
    static {
        Covode.recordClassIndex(69687);
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.a$a */
    public static final class C59310a implements Serializable {

        /* renamed from: a */
        private String f135516a;

        /* renamed from: b */
        private String f135517b;

        /* renamed from: c */
        private long f135518c;

        /* renamed from: d */
        private int f135519d;

        /* renamed from: e */
        private long f135520e;

        /* renamed from: f */
        private int f135521f;

        /* renamed from: g */
        private String f135522g;

        static {
            Covode.recordClassIndex(69688);
        }

        public final int getId() {
            return this.f135521f;
        }

        public final int getMediaType() {
            return this.f135519d;
        }

        public final String getName() {
            return this.f135517b;
        }

        public final String getParentDir() {
            return this.f135522g;
        }

        public final String getPath() {
            return this.f135516a;
        }

        public final long getSize() {
            return this.f135520e;
        }

        public final long getTime() {
            return this.f135518c;
        }

        public final void setId(int i) {
            this.f135521f = i;
        }

        public final void setMediaType(int i) {
            this.f135519d = i;
        }

        public final void setName(String str) {
            this.f135517b = str;
        }

        public final void setParentDir(String str) {
            this.f135522g = str;
        }

        public final void setPath(String str) {
            this.f135516a = str;
        }

        public final void setSize(long j) {
            this.f135520e = j;
        }

        public final void setTime(long j) {
            this.f135518c = j;
        }

        public C59310a(String str, String str2, long j, int i, long j2, int i2, String str3) {
            this.f135516a = str;
            this.f135517b = str2;
            this.f135518c = j;
            this.f135519d = i;
            this.f135520e = j2;
            this.f135521f = i2;
            this.f135522g = str3;
        }
    }
}
