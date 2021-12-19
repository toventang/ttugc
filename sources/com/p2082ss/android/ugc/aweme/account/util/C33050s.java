package com.p2082ss.android.ugc.aweme.account.util;

import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.account.login.EnumC32330v;
import java.util.List;
import java.util.ListIterator;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4622m.C89350l;

/* renamed from: com.ss.android.ugc.aweme.account.util.s */
public final class C33050s {
    @AbstractC27891c(mo46611a = "show_num")

    /* renamed from: a */
    public Integer f78601a;
    @AbstractC27891c(mo46611a = "sign_up_order")

    /* renamed from: b */
    public String f78602b;
    @AbstractC27891c(mo46611a = "log_in_order")

    /* renamed from: c */
    public String f78603c;
    @AbstractC27891c(mo46611a = "recover_account_url")

    /* renamed from: d */
    public String f78604d;
    @AbstractC27891c(mo46611a = "platform_configs")

    /* renamed from: e */
    public C28022o f78605e;

    static {
        Covode.recordClassIndex(39857);
    }

    /* renamed from: a */
    public final EnumC32330v[] mo58836a(boolean z) {
        String str;
        List list;
        if (z) {
            str = this.f78602b;
        } else {
            str = this.f78603c;
        }
        if (str == null) {
            return null;
        }
        List<String> split = new C89350l(",").split(str, 0);
        if (!split.isEmpty()) {
            ListIterator<String> listIterator = split.listIterator(split.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        list = C89070n.m154571d((Iterable) split, listIterator.nextIndex() + 1);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        list = C89086z.INSTANCE;
        EnumC32330v[] vVarArr = new EnumC32330v[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            vVarArr[i] = EnumC32330v.valueOf((String) list.get(i));
        }
        return (EnumC32330v[]) C89064i.m154513n(vVarArr);
    }
}
