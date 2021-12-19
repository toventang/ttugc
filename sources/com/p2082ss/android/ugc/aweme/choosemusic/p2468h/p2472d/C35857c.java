package com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2472d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35893am;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35894an;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35898ar;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.h.d.c */
public final class C35857c {

    /* renamed from: d */
    public static String f84637d = "";

    /* renamed from: e */
    public static final C35858a f84638e = new C35858a((byte) 0);

    /* renamed from: a */
    public String f84639a;

    /* renamed from: b */
    public LogPbBean f84640b;

    /* renamed from: c */
    public C35893am f84641c;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.h.d.c$a */
    public static final class C35858a {
        static {
            Covode.recordClassIndex(43097);
        }

        private C35858a() {
        }

        public /* synthetic */ C35858a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m73253a(String str) {
            C89219l.m154721d(str, "");
            C35857c.f84637d = str;
        }
    }

    static {
        Covode.recordClassIndex(43096);
    }

    /* renamed from: a */
    public final void mo62965a(C35894an anVar) {
        Integer num;
        String str;
        String str2;
        C89219l.m154721d(anVar, "");
        C35855a a = new C35855a().mo62963a("words_source", "sug").mo62963a("search_position", "music_create");
        C35898ar wordRecord = anVar.getWordRecord();
        String str3 = null;
        if (wordRecord != null) {
            num = Integer.valueOf(wordRecord.getWordPosition());
        } else {
            num = null;
        }
        C35855a a2 = a.mo62962a("words_position", num);
        LogPbBean logPbBean = this.f84640b;
        if (logPbBean != null) {
            str = logPbBean.getImprId();
        } else {
            str = null;
        }
        C35855a a3 = a2.mo62963a("impr_id", str).mo62963a("raw_query", this.f84639a).mo62963a("words_content", this.f84639a);
        C35893am amVar = this.f84641c;
        if (amVar != null) {
            str2 = amVar.getQueryId();
        } else {
            str2 = null;
        }
        C35855a a4 = a3.mo62963a("query_id", str2);
        C35898ar wordRecord2 = anVar.getWordRecord();
        if (wordRecord2 != null) {
            str3 = wordRecord2.getId();
        }
        C39162r.m79460a("sug_input_click", a4.mo62963a("group_id", str3).f84633a);
    }
}
