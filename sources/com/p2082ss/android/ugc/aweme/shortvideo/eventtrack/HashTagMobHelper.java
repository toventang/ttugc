package com.p2082ss.android.ugc.aweme.shortvideo.eventtrack;

import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.common.LogPbBean;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecommendWordMob;
import com.p2082ss.android.ugc.aweme.video.hashtag.C80735b;
import com.p2082ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper */
public final class HashTagMobHelper extends AbstractC1174ac {

    /* renamed from: g */
    public static final C71819a f160958g = new C71819a((byte) 0);

    /* renamed from: a */
    public String f160959a;

    /* renamed from: b */
    public LogPbBean f160960b;

    /* renamed from: c */
    public RecommendWordMob f160961c;

    /* renamed from: d */
    public String f160962d;

    /* renamed from: e */
    public BaseTitleHelper f160963e;

    /* renamed from: f */
    public List<? extends C80735b> f160964f;

    /* renamed from: h */
    private boolean f160965h;

    /* renamed from: i */
    private String f160966i;

    static {
        Covode.recordClassIndex(84364);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper$a */
    public static final class C71819a {
        static {
            Covode.recordClassIndex(84365);
        }

        private C71819a() {
        }

        public /* synthetic */ C71819a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo113479a() {
        if (this.f160962d != null) {
            List<? extends C80735b> list = this.f160964f;
            if (!(list == null || list.isEmpty())) {
                for (int i = 0; i < list.size(); i++) {
                    C80735b bVar = (C80735b) list.get(i);
                    if (C89219l.m154714a((Object) this.f160962d, (Object) bVar.f180510a.challengeName)) {
                        mo113482a("input_sharp", bVar, Integer.valueOf(i), "input");
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo113481a(String str) {
        String str2;
        if (C89219l.m154714a((Object) str, (Object) "click_tag_button")) {
            this.f160965h = true;
        } else if (this.f160965h) {
            this.f160965h = false;
            return;
        }
        this.f160966i = str;
        C39163s sVar = new C39163s();
        BaseTitleHelper baseTitleHelper = this.f160963e;
        if (baseTitleHelper != null) {
            str2 = baseTitleHelper.f180542c;
        } else {
            str2 = null;
        }
        C39162r.m79461a("show_tag", sVar.mo67941a("title", str2).mo67941a("creation_id", this.f160959a).mo67941a("enter_method", str).mo67942a());
    }

    /* renamed from: a */
    public final void mo113480a(C80735b bVar, Integer num) {
        String str;
        if (bVar != null && num != null) {
            num.intValue();
            C39163s a = new C39163s().mo67941a("enter_method", this.f160966i).mo67941a("tag_id", bVar.f180510a.getCid()).mo67941a("tag_source", bVar.f180515f).mo67941a("tag_content", bVar.f180510a.challengeName).mo67941a("rank", String.valueOf(num.intValue())).mo67941a("creation_id", this.f160959a);
            BaseTitleHelper baseTitleHelper = this.f160963e;
            if (baseTitleHelper != null) {
                str = baseTitleHelper.f180542c;
            } else {
                str = null;
            }
            C39162r.m79461a("show_tag_words", a.mo67941a("title", str).mo67942a());
        }
    }

    /* renamed from: b */
    public final void mo113483b(C80735b bVar, Integer num) {
        String str;
        if (bVar != null && num != null) {
            num.intValue();
            String str2 = bVar.f180510a.cid;
            C39163s a = new C39163s().mo67941a("words_content", bVar.f180510a.challengeName).mo67941a("words_position", String.valueOf(num.intValue())).mo67941a("words_source", "sug").mo67941a("search_position", "challenge_create").mo67941a("raw_query", this.f160962d).mo67941a("rank", "-1");
            RecommendWordMob recommendWordMob = this.f160961c;
            String str3 = null;
            if (recommendWordMob != null) {
                str = recommendWordMob.getQueryId();
            } else {
                str = null;
            }
            C39163s a2 = a.mo67941a("query_id", str).mo67941a("group_id", str2);
            if (this.f160960b != null && !bVar.f180516g) {
                LogPbBean logPbBean = this.f160960b;
                if (logPbBean != null) {
                    str3 = logPbBean.getImprId();
                }
            } else {
                str3 = "";
            }
            C39162r.m79461a("trending_words_show", a2.mo67941a("impr_id", str3).mo67942a());
        }
    }

    /* renamed from: a */
    public final void mo113482a(String str, C80735b bVar, Integer num, String str2) {
        String str3;
        if (bVar != null && num != null) {
            num.intValue();
            String cid = bVar.f180510a.getCid();
            C39163s a = new C39163s().mo67941a("enter_method", str);
            String str4 = "";
            if (cid == null) {
                cid = str4;
            }
            C39163s a2 = a.mo67941a("tag_id", cid);
            if (str2 == null) {
                str2 = bVar.f180515f;
            }
            C39163s a3 = a2.mo67941a("tag_source", str2).mo67941a("tag_content", bVar.f180510a.challengeName).mo67941a("rank", String.valueOf(num.intValue())).mo67941a("creation_id", this.f160959a);
            BaseTitleHelper baseTitleHelper = this.f160963e;
            if (baseTitleHelper != null) {
                str3 = baseTitleHelper.f180542c;
            } else {
                str3 = null;
            }
            C39163s a4 = a3.mo67941a("title", str3);
            if (this.f160960b != null) {
                str4 = C63238c.f143575b.mo46674b(this.f160960b);
            }
            C39162r.m79461a("add_tag", a4.mo67941a("log_pb", str4).mo67942a());
        }
    }
}
