package com.p2082ss.android.ugc.tiktok.seclink.impl.p4332a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tiktok.seclink.impl.a.d */
public final class C84342d {
    @AbstractC27891c(mo46611a = "seclink_white_list")

    /* renamed from: a */
    public final List<String> f188580a;

    static {
        Covode.recordClassIndex(98293);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C84342d) && C89219l.m154714a(this.f188580a, ((C84342d) obj).f188580a);
        }
        return true;
    }

    public final int hashCode() {
        List<String> list = this.f188580a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SecLinkLocalConfig(whiteList=" + this.f188580a + ")";
    }

    public /* synthetic */ C84342d() {
        this(C89070n.m154524c(".tiktok.com", ".whatsapp.com", ".twitter.com", ".twitch.com", ".youtube.com", ".amazon.com", ".google.com", ".snapchat.com", ".sgsnssdk.com"));
    }

    private C84342d(List<String> list) {
        C89219l.m154721d(list, "");
        this.f188580a = list;
    }
}
