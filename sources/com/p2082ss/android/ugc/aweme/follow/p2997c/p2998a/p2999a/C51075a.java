package com.p2082ss.android.ugc.aweme.follow.p2997c.p2998a.p2999a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.follow.c.a.a.a */
public final class C51075a implements Cloneable {
    @AbstractC27891c(mo46611a = "user_id")

    /* renamed from: a */
    public final String f117801a;
    @AbstractC27891c(mo46611a = "recommend_item_list")

    /* renamed from: b */
    public final List<Aweme> f117802b;

    /* renamed from: c */
    public User f117803c;

    /* renamed from: d */
    public int f117804d;

    static {
        Covode.recordClassIndex(60263);
    }

    public final String toString() {
        return "RecommendFollowStruct(uid=" + this.f117801a + ", awemeList=" + this.f117802b + ", user=" + this.f117803c + ", index=" + this.f117804d + ")";
    }

    public final int hashCode() {
        return this.f117801a.hashCode();
    }

    /* renamed from: a */
    public final C51075a clone() {
        String str = this.f117801a;
        List<Aweme> a = m95485a(this.f117802b);
        User clone = this.f117803c.clone();
        C89219l.m154716b(clone, "");
        return new C51075a(str, a, clone, this.f117804d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C51075a)) {
            return false;
        }
        return TextUtils.equals(((C51075a) obj).f117801a, this.f117801a);
    }

    /* renamed from: a */
    private static List<Aweme> m95485a(List<Aweme> list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AwemeService.m70060b().mo60677a(it.next().clone()));
        }
        return arrayList;
    }

    private C51075a(String str, List<Aweme> list, User user, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(user, "");
        this.f117801a = str;
        this.f117802b = list;
        this.f117803c = user;
        this.f117804d = i;
    }
}
