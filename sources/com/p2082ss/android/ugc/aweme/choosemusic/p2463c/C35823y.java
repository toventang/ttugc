package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35701a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2462b.C35755a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.y */
public final class C35823y extends AbstractC35789d {

    /* renamed from: n */
    public static final C35824a f84589n = new C35824a((byte) 0);

    /* renamed from: o */
    private HashMap f84590o;

    static {
        Covode.recordClassIndex(43062);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.c.y$a */
    public static final class C35824a {
        static {
            Covode.recordClassIndex(43063);
        }

        private C35824a() {
        }

        public /* synthetic */ C35824a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35789d
    /* renamed from: a */
    public final void mo62864a() {
        C35701a aVar = this.f84477e;
        C89219l.m154716b(aVar, "");
        aVar.mo67829d(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f84590o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35789d
    /* renamed from: b */
    public final void mo62867b() {
        Boolean bool = (Boolean) this.f84475c.mo60195b("data_sticker_music_from_video", (Object) true);
        List list = (List) this.f84475c.mo60195b("data_sticker", (Object) null);
        C89219l.m154716b(bool, "");
        if (bool.booleanValue()) {
            if (this.f84475c.mo60192a("data_challenge") != null) {
                this.f84477e.mo62744e(5);
            } else if (list != null && list.size() > 0) {
                this.f84477e.mo62744e(4);
            }
        } else if (list != null && list.size() > 0) {
            this.f84477e.mo62744e(4);
        } else if (this.f84475c.mo60192a("data_challenge") != null) {
            this.f84477e.mo62744e(5);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2463c.AbstractC35789d
    /* renamed from: a */
    public final void mo62866a(C33942b bVar) {
        int i;
        C89219l.m154721d(bVar, "");
        Object a = bVar.mo60212a();
        C89219l.m154716b(a, "");
        C35755a aVar = (C35755a) a;
        if (getUserVisibleHint() && aVar.f84359c != -1) {
            if (!(aVar.f84360d == 1 && aVar.f84357a == 0) && aVar.f84357a == 1) {
                C79459a aVar2 = new C79459a(getActivity());
                if (aVar.f84360d == 1) {
                    i = R.string.ah3;
                } else {
                    i = R.string.a92;
                }
                aVar2.mo123050a(i).mo123053a();
            }
        }
    }
}
