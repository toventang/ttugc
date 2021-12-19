package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35890aj;
import com.p2082ss.android.ugc.aweme.choosemusic.p2465e.C35836c;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2469a.C35843a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2468h.p2471c.C35851b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.k */
final /* synthetic */ class C35802k implements AbstractC1214u {

    /* renamed from: a */
    private final AbstractC35797j f84532a;

    static {
        Covode.recordClassIndex(43041);
    }

    C35802k(AbstractC35797j jVar) {
        this.f84532a = jVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        AbstractC35797j jVar = this.f84532a;
        Integer num = (Integer) obj;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                C35890aj value = jVar.f84518l.mo62737c().getValue();
                if (value != null && value.f84697b == 3) {
                    String str = value.f84698c;
                    C39162r.m79460a("search_sug", new C33744d().mo59983a("action_type", "click").mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(jVar.f84524r)).mo59983a("sug_keyword", jVar.f84523q).mo59983a("search_keyword", str).mo59983a("search_type", "video_music").mo59980a("order", value.f84700e).f79943a);
                }
            } else if (intValue == 1) {
                jVar.mo62896c();
            } else if (intValue == 2) {
                jVar.mo62902n();
                jVar.mo62897d();
                jVar.mo62901m();
                if (jVar.f84517k == null) {
                    jVar.f84517k = new C35843a(jVar.getActivity());
                }
                if (jVar.f84512b.getAdapter() != jVar.f84517k) {
                    jVar.f84512b.setAdapter(jVar.f84517k);
                }
                jVar.f84511a.f84625c.f84634a = C35836c.m73228g().mo62944e();
                C35851b bVar = jVar.f84511a;
                bVar.f84626d = jVar.f84523q;
                bVar.f84627e = "music_create";
                bVar.f84624b.removeCallbacks(bVar.f84628f);
                bVar.f84624b.postDelayed(bVar.f84628f, 150);
            }
        }
    }
}
