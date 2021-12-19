package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a.C57172a;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3320b.C57191a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.c.l */
public final class C57216l extends AbstractC57197b {

    /* renamed from: n */
    public static final C57217a f130335n = new C57217a((byte) 0);

    /* renamed from: o */
    private HashMap f130336o;

    static {
        Covode.recordClassIndex(67121);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.c.l$a */
    public static final class C57217a {
        static {
            Covode.recordClassIndex(67122);
        }

        private C57217a() {
        }

        public /* synthetic */ C57217a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57197b
    /* renamed from: a */
    public final void mo94408a() {
        C57172a aVar = this.f130266e;
        C89219l.m154716b(aVar, "");
        aVar.mo67829d(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f130336o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57197b
    /* renamed from: b */
    public final void mo94411b() {
        Boolean bool = (Boolean) this.f130264c.mo60195b("data_sticker_music_from_video", (Object) true);
        List list = (List) this.f130264c.mo60195b("data_sticker", (Object) null);
        C89219l.m154716b(bool, "");
        if (bool.booleanValue()) {
            if (this.f130264c.mo60192a("data_challenge") != null) {
                this.f130266e.mo94373e(5);
            } else if (list != null && list.size() > 0) {
                this.f130266e.mo94373e(4);
            }
        } else if (list != null && list.size() > 0) {
            this.f130266e.mo94373e(4);
        } else if (this.f130264c.mo60192a("data_challenge") != null) {
            this.f130266e.mo94373e(5);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.choosemusic.p3321c.AbstractC57197b
    /* renamed from: a */
    public final void mo94410a(C33942b bVar) {
        int i;
        C89219l.m154721d(bVar, "");
        Object a = bVar.mo60212a();
        C89219l.m154716b(a, "");
        C57191a aVar = (C57191a) a;
        if (getUserVisibleHint() && aVar.f130233c != -1) {
            if (!(aVar.f130234d == 1 && aVar.f130231a == 0) && aVar.f130231a == 1) {
                C79459a aVar2 = new C79459a(getActivity());
                if (aVar.f130234d == 1) {
                    i = R.string.ah3;
                } else {
                    i = R.string.a92;
                }
                aVar2.mo123050a(i).mo123053a();
            }
        }
    }
}
