package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import com.google.gson.C27917g;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.discover.C41856b;
import com.p2082ss.android.ugc.aweme.net.BaseResponseObjectTypeAdapterFactory;
import com.p2082ss.android.ugc.aweme.net.CollectionTypeAdapterFactory;
import com.p2082ss.android.ugc.aweme.net.ModelCheckerTypeAdapterFactory;
import com.p2082ss.android.ugc.aweme.net.MusicTypeAdapterFactory;
import com.p2082ss.android.ugc.aweme.net.UserTypeAdapterFactory;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.sticker.model.C75439a;
import com.p2082ss.android.ugc.aweme.typeadapter.BackgroundVideoDeserializer;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.utils.GsonHolder */
public class GsonHolder implements GsonProvider {

    /* renamed from: a */
    private final C27910f f179612a;

    /* renamed from: b */
    private final C27910f f179613b;

    static {
        Covode.recordClassIndex(93420);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.GsonProvider
    /* renamed from: b */
    public final C27910f mo123620b() {
        return this.f179612a;
    }

    public GsonHolder() {
        C27917g a = m138942a();
        C67446h.f151111a.mo106199a(a);
        C41856b.f97654a.mo70760a(a);
        C27910f b = a.mo46682b();
        this.f179612a = b;
        this.f179613b = b;
    }

    /* renamed from: a */
    public static C27917g m138942a() {
        C27917g a = C80361dw.m139332a();
        a.mo46679a(new ModelCheckerTypeAdapterFactory());
        a.mo46679a(new CollectionTypeAdapterFactory());
        a.mo46679a(new MusicTypeAdapterFactory());
        a.mo46679a(new UserTypeAdapterFactory());
        a.mo46681a((Type) C75439a.class, (Object) new BackgroundVideoDeserializer());
        a.mo46679a(new BaseResponseObjectTypeAdapterFactory());
        return a;
    }

    /* renamed from: c */
    public static GsonProvider m138943c() {
        MethodCollector.m26663i(11006);
        Object a = C81908b.m141854a(GsonProvider.class, false);
        if (a != null) {
            GsonProvider gsonProvider = (GsonProvider) a;
            MethodCollector.m26664o(11006);
            return gsonProvider;
        }
        if (C81908b.f183392ev == null) {
            synchronized (GsonProvider.class) {
                try {
                    if (C81908b.f183392ev == null) {
                        C81908b.f183392ev = new GsonHolder();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11006);
                    throw th;
                }
            }
        }
        GsonHolder gsonHolder = (GsonHolder) C81908b.f183392ev;
        MethodCollector.m26664o(11006);
        return gsonHolder;
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.GsonProvider
    /* renamed from: a */
    public final void mo123619a(Type type) {
        this.f179612a.mo46663a((C27895a) C27895a.get(type));
    }
}
