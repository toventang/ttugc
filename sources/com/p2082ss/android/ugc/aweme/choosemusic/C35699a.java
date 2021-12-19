package com.p2082ss.android.ugc.aweme.choosemusic;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36050s;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41955b;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.search.SearchServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.a */
public final class C35699a {

    /* renamed from: a */
    public static final C35699a f84200a = new C35699a();

    private C35699a() {
    }

    /* renamed from: a */
    public static void m72863a() {
        MusicService.m81198m().mo69322k();
    }

    static {
        Covode.recordClassIndex(42931);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.a$a */
    public static final class C35700a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C35700a f84201a = new C35700a();

        static {
            Covode.recordClassIndex(42932);
        }

        C35700a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_large_music_note;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bd);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final <T> void m72866a(AbstractC39060f<T> fVar) {
        if (fVar != null) {
            fVar.mo67829d(false);
        }
    }

    /* renamed from: a */
    public static final void m72864a(Activity activity, String str, String str2) {
        m72863a();
        if (str == null) {
            str = "";
        }
        C58957c.m108320a(activity, str, str2, (Bundle) null, (AbstractC34543f) null);
    }

    /* renamed from: a */
    public static final void m72865a(C36050s sVar, MusicModel musicModel, C35754b bVar, boolean z) {
        String str;
        String str2;
        String str3;
        if (sVar != null) {
            if (bVar != null) {
                str = bVar.f84347a;
            } else {
                str = null;
            }
            if (TextUtils.equals("search_music", str)) {
                AbstractC41955b f = SearchServiceImpl.m119336t().mo106217f();
                if (bVar == null || (str2 = bVar.f84347a) == null) {
                    str2 = "";
                }
                int position = sVar.getPosition();
                if (z) {
                    str3 = "click_pause_music";
                } else {
                    str3 = "click_play_music";
                }
                f.mo71116a(str2, musicModel, position, str3);
            }
        }
    }
}
