package com.p2082ss.android.ugc.aweme.feed.assem.digg;

import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.j */
public final class C48700j implements AbstractC12779c {

    /* renamed from: a */
    public final String f112551a;

    /* renamed from: b */
    public final String f112552b;

    /* renamed from: c */
    public final String f112553c;

    /* renamed from: d */
    public final String f112554d;

    /* renamed from: e */
    public final String f112555e;

    /* renamed from: f */
    public final String f112556f;

    /* renamed from: g */
    public final VideoDiggWidget.AbstractC49543a f112557g;

    static {
        Covode.recordClassIndex(57480);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48700j)) {
            return false;
        }
        C48700j jVar = (C48700j) obj;
        return C89219l.m154714a(this.f112551a, jVar.f112551a) && C89219l.m154714a(this.f112552b, jVar.f112552b) && C89219l.m154714a(this.f112553c, jVar.f112553c) && C89219l.m154714a(this.f112554d, jVar.f112554d) && C89219l.m154714a(this.f112555e, jVar.f112555e) && C89219l.m154714a(this.f112556f, jVar.f112556f) && C89219l.m154714a(this.f112557g, jVar.f112557g);
    }

    public final int hashCode() {
        String str = this.f112551a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f112552b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f112553c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f112554d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f112555e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f112556f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        VideoDiggWidget.AbstractC49543a aVar = this.f112557g;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "VideoDiggHierarchyData(previousPage=" + this.f112551a + ", fromGroupId=" + this.f112552b + ", previousPagePosition=" + this.f112553c + ", creationId=" + this.f112554d + ", challengeId=" + this.f112555e + ", parentTagId=" + this.f112556f + ", infoProvider=" + this.f112557g + ")";
    }

    public /* synthetic */ C48700j() {
        this(null, null, null, null, null, null, null);
    }

    public C48700j(String str, String str2, String str3, String str4, String str5, String str6, VideoDiggWidget.AbstractC49543a aVar) {
        this.f112551a = str;
        this.f112552b = str2;
        this.f112553c = str3;
        this.f112554d = str4;
        this.f112555e = str5;
        this.f112556f = str6;
        this.f112557g = aVar;
    }
}
