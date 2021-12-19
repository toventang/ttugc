package com.p2082ss.android.ugc.aweme.miniapp_api.model.net;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.net.MicroAppHttpHeader */
public final class MicroAppHttpHeader {
    private final String name;
    private final String value;

    static {
        Covode.recordClassIndex(69696);
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        int i;
        String str = this.name;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.value;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.name;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        StringBuilder append = sb.append(str).append(": ");
        String str3 = this.value;
        if (str3 != null) {
            str2 = str3;
        }
        return append.append(str2).toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!C89219l.m154714a(getClass(), obj.getClass()))) {
            return false;
        }
        MicroAppHttpHeader microAppHttpHeader = (MicroAppHttpHeader) obj;
        if (true ^ C89219l.m154714a((Object) this.name, (Object) microAppHttpHeader.name)) {
            return false;
        }
        return C89219l.m154714a((Object) this.value, (Object) microAppHttpHeader.value);
    }

    public MicroAppHttpHeader(String str, String str2) {
        this.name = str;
        this.value = str2;
    }
}
