package com.bytedance.ies.ugc.network.partner.p1276b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.network.partner.b.d */
public final class C18197d {

    /* renamed from: a */
    private final String f43335a = " \"<>^`{}|/\\?#";

    /* renamed from: b */
    private final List<String> f43336b;

    /* renamed from: c */
    private String f43337c;

    static {
        Covode.recordClassIndex(20853);
    }

    public C18197d() {
        ArrayList arrayList = new ArrayList();
        this.f43336b = arrayList;
        arrayList.add("");
    }

    /* renamed from: a */
    public final String mo29049a() {
        String str = this.f43337c;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : this.f43336b) {
            sb.append('/').append(str2);
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        this.f43337c = sb2;
        return sb2;
    }

    /* renamed from: a */
    public final void mo29051a(StringBuilder sb) {
        C89219l.m154721d(sb, "");
        int size = this.f43336b.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            String str = this.f43336b.get(i);
            sb.append(C18194a.m33843a(str, 0, str.length(), this.f43335a, false, false, true));
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f0 A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo29050a(java.lang.String r15, int r16, int r17) {
        /*
        // Method dump skipped, instructions count: 241
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.network.partner.p1276b.C18197d.mo29050a(java.lang.String, int, int):void");
    }
}
