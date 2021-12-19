package com.p2082ss.android.ugc.trill.setting;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.i18n.language.C53451b;
import java.util.ArrayList;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.trill.setting.TranslationLanguageViewModel */
public final class TranslationLanguageViewModel extends AbstractC1174ac {

    /* renamed from: d */
    public static final C85113a f190445d = new C85113a((byte) 0);

    /* renamed from: a */
    C1213t<ArrayList<C53451b>> f190446a;

    /* renamed from: b */
    int f190447b = -1;

    /* renamed from: c */
    final TranslationLanguageApi f190448c;

    /* renamed from: com.ss.android.ugc.trill.setting.TranslationLanguageViewModel$b */
    static final class C85114b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C85114b f190449a = new C85114b();

        static {
            Covode.recordClassIndex(99152);
        }

        C85114b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.TranslationLanguageViewModel$c */
    static final class C85115c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C85115c f190450a = new C85115c();

        static {
            Covode.recordClassIndex(99153);
        }

        C85115c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(99150);
    }

    /* renamed from: com.ss.android.ugc.trill.setting.TranslationLanguageViewModel$a */
    public static final class C85113a {
        static {
            Covode.recordClassIndex(99151);
        }

        private C85113a() {
        }

        public /* synthetic */ C85113a(byte b) {
            this();
        }
    }

    public TranslationLanguageViewModel() {
        Object a = RetrofitFactory.m33635a().mo28817b(Api.f79771d).mo28832d().mo28858a(TranslationLanguageApi.class);
        C89219l.m154716b(a, "");
        this.f190448c = (TranslationLanguageApi) a;
    }
}
