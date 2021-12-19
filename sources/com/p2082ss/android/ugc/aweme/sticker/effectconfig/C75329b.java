package com.p2082ss.android.ugc.aweme.sticker.effectconfig;

import android.text.TextUtils;
import android.util.Base64;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.sticker.p3957e.C75323c;
import java.io.File;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.ss.android.ugc.aweme.sticker.effectconfig.b */
public final class C75329b {

    /* renamed from: a */
    public final ActivityC0945e f169333a;

    /* renamed from: b */
    public final AbstractC75339c f169334b;

    /* renamed from: c */
    public final EffectConfigViewModel f169335c;

    /* renamed from: d */
    private final ShortVideoContext f169336d;

    static {
        Covode.recordClassIndex(88247);
    }

    /* renamed from: a */
    public final boolean mo118911a() {
        if (TextUtils.isEmpty(this.f169336d.f155769aC)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f169336d.f155769aC);
            String optString = jSONObject.optString("effect_key");
            JSONObject jSONObject2 = jSONObject.getJSONObject("effect_meta_info_value");
            AbstractC75339c cVar = this.f169334b;
            C89219l.m154716b(optString, "");
            String jSONObject3 = jSONObject2.toString();
            C89219l.m154716b(jSONObject3, "");
            cVar.mo118915a(optString, jSONObject3);
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.effectconfig.b$c */
    public static final class C75336c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C75329b f169344a;

        static {
            Covode.recordClassIndex(88254);
        }

        public C75336c(C75329b bVar) {
            this.f169344a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            final AbstractC75328a aVar = (AbstractC75328a) obj;
            C1731i.m5640b(new Callable(this) {
                /* class com.p2082ss.android.ugc.aweme.sticker.effectconfig.C75329b.C75336c.CallableC753371 */

                /* renamed from: a */
                final /* synthetic */ C75336c f169345a;

                static {
                    Covode.recordClassIndex(88255);
                }

                {
                    this.f169345a = r1;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    this.f169345a.f169344a.mo118910a(aVar);
                    return C89391z.f203057a;
                }
            }, C40780g.m82241a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.effectconfig.b$a */
    public static final class C75330a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C75329b f169337a;

        static {
            Covode.recordClassIndex(88248);
        }

        public C75330a(C75329b bVar) {
            this.f169337a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            final AbstractC75328a aVar = (AbstractC75328a) obj;
            C1731i.m5640b(new Callable(this) {
                /* class com.p2082ss.android.ugc.aweme.sticker.effectconfig.C75329b.C75330a.CallableC753311 */

                /* renamed from: a */
                final /* synthetic */ C75330a f169338a;

                static {
                    Covode.recordClassIndex(88249);
                }

                {
                    this.f169338a = r1;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return Boolean.valueOf(this.f169338a.f169337a.mo118911a());
                }
            }, C40780g.m82241a()).mo5534a(new AbstractC1729g(this) {
                /* class com.p2082ss.android.ugc.aweme.sticker.effectconfig.C75329b.C75330a.C753322 */

                /* renamed from: a */
                final /* synthetic */ C75330a f169339a;

                static {
                    Covode.recordClassIndex(88250);
                }

                {
                    this.f169339a = r1;
                }

                @Override // p077b.AbstractC1729g
                public final /* synthetic */ Object then(C1731i iVar) {
                    boolean z;
                    C89219l.m154716b(iVar, "");
                    Object d = iVar.mo5545d();
                    C89219l.m154716b(d, "");
                    if (((Boolean) d).booleanValue()) {
                        this.f169339a.f169337a.mo118910a(aVar);
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }, C40780g.m82241a(), null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.effectconfig.b$b */
    public static final class C75333b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C75329b f169341a;

        static {
            Covode.recordClassIndex(88251);
        }

        public C75333b(C75329b bVar) {
            this.f169341a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            final AbstractC75328a aVar = (AbstractC75328a) obj;
            C1731i.m5640b(new Callable(this) {
                /* class com.p2082ss.android.ugc.aweme.sticker.effectconfig.C75329b.C75333b.CallableC753341 */

                /* renamed from: a */
                final /* synthetic */ C75333b f169342a;

                static {
                    Covode.recordClassIndex(88252);
                }

                {
                    this.f169342a = r1;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return Boolean.valueOf(this.f169342a.f169341a.mo118911a());
                }
            }, C40780g.m82241a()).mo5534a(new AbstractC1729g() {
                /* class com.p2082ss.android.ugc.aweme.sticker.effectconfig.C75329b.C75333b.C753352 */

                static {
                    Covode.recordClassIndex(88253);
                }

                @Override // p077b.AbstractC1729g
                public final /* synthetic */ Object then(C1731i iVar) {
                    AbstractC75328a aVar;
                    C89219l.m154716b(iVar, "");
                    Object d = iVar.mo5545d();
                    C89219l.m154716b(d, "");
                    if (((Boolean) d).booleanValue() && (aVar = aVar) != null) {
                        aVar.mo118909a();
                    }
                    return iVar.mo5545d();
                }
            }, C1731i.f5564c, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.effectconfig.b$d */
    public static final class C75338d extends C75323c {

        /* renamed from: a */
        final /* synthetic */ C75329b f169347a;

        /* renamed from: b */
        final /* synthetic */ String f169348b;

        /* renamed from: c */
        final /* synthetic */ int f169349c;

        /* renamed from: d */
        final /* synthetic */ JSONArray f169350d;

        /* renamed from: e */
        final /* synthetic */ AbstractC75328a f169351e;

        static {
            Covode.recordClassIndex(88256);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3957e.C75323c, com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            AbstractC75328a aVar;
            super.onSuccessed(downloadInfo);
            if (downloadInfo != null) {
                downloadInfo.getSavePath();
                downloadInfo.getName();
                if (this.f169349c == this.f169350d.length() - 1 && (aVar = this.f169351e) != null) {
                    aVar.mo118909a();
                }
            }
        }

        C75338d(C75329b bVar, String str, int i, JSONArray jSONArray, AbstractC75328a aVar) {
            this.f169347a = bVar;
            this.f169348b = str;
            this.f169349c = i;
            this.f169350d = jSONArray;
            this.f169351e = aVar;
        }
    }

    /* renamed from: a */
    public final void mo118910a(AbstractC75328a aVar) {
        if (!TextUtils.isEmpty(this.f169336d.f155770aD)) {
            try {
                JSONArray jSONArray = new JSONObject(this.f169336d.f155770aD).getJSONArray("effect_image_list");
                if (jSONArray != null && jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String optString = jSONObject.optString("effect_key");
                        String optString2 = jSONObject.optString("effect_image_value");
                        ActivityC0945e eVar = this.f169333a;
                        C89219l.m154716b(optString2, "");
                        C75338d dVar = new C75338d(this, optString, i, jSONArray, aVar);
                        C89219l.m154721d(eVar, "");
                        C89219l.m154721d(optString2, "");
                        C89219l.m154721d(dVar, "");
                        DownloadInfo downloadInfo = new DownloadInfo();
                        if (TextUtils.isEmpty(optString2)) {
                            dVar.onFailed(downloadInfo, new BaseException(0, "url=null"));
                        }
                        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                            C58029j.f132253e = C75340d.m132140a();
                        }
                        if (!C58029j.f132253e) {
                            dVar.onFailed(downloadInfo, new BaseException(0, "network error"));
                        }
                        byte[] bytes = optString2.getBytes(C89338d.f202990a);
                        C89219l.m154716b(bytes, "");
                        File file = new File(EffectPlatform.f108127a.getAbsolutePath() + File.separator + Base64.encodeToString(bytes, 2));
                        Downloader.with(eVar).url(optString2).savePath(file.getParent() + File.separator).name(file.getName()).mainThreadListener(dVar).retryCount(1).download();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public C75329b(ActivityC0945e eVar, ShortVideoContext shortVideoContext, AbstractC75339c cVar, EffectConfigViewModel effectConfigViewModel) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(effectConfigViewModel, "");
        this.f169333a = eVar;
        this.f169336d = shortVideoContext;
        this.f169334b = cVar;
        this.f169335c = effectConfigViewModel;
    }
}
