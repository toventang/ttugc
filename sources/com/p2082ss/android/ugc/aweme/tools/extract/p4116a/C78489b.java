package com.p2082ss.android.ugc.aweme.tools.extract.p4116a;

import android.net.Uri;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c;
import com.facebook.imagepipeline.p1871a.p1872a.C24325e;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.C24452a;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.facebook.p1844d.AbstractC24157c;
import com.facebook.p1844d.AbstractC24160e;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executors;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.a.b */
public final class C78489b {

    /* renamed from: a */
    public static final C78489b f176396a = new C78489b();

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.a.b$a */
    public interface AbstractC78490a {
        static {
            Covode.recordClassIndex(91622);
        }

        /* renamed from: a */
        void mo122414a(HashMap<String, Integer> hashMap);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.a.b$b */
    public interface AbstractC78491b {
        static {
            Covode.recordClassIndex(91623);
        }

        /* renamed from: a */
        void mo122415a(boolean z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.extract.a.b$c */
    public interface AbstractC78492c {
        static {
            Covode.recordClassIndex(91624);
        }

        /* renamed from: a */
        void mo122416a(String str, int i);
    }

    private C78489b() {
    }

    static {
        Covode.recordClassIndex(91621);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.a.b$e */
    public static final class C78494e implements AbstractC78490a {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89236c f176401a;

        /* renamed from: b */
        final /* synthetic */ AbstractC78491b f176402b;

        /* renamed from: c */
        final /* synthetic */ int f176403c;

        static {
            Covode.recordClassIndex(91626);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.extract.p4116a.C78489b.AbstractC78490a
        /* renamed from: a */
        public final void mo122414a(HashMap<String, Integer> hashMap) {
            C89219l.m154721d(hashMap, "");
            Collection<Integer> values = hashMap.values();
            C89219l.m154716b(values, "");
            int i = 0;
            for (T t : values) {
                if (t != null && t.intValue() == 0) {
                    this.f176401a.element++;
                }
                C89219l.m154716b(t, "");
                i += t.intValue();
            }
            this.f176401a.element += (i / LiveNetAdaptiveHurryTimeSetting.DEFAULT) + 1;
            if (this.f176401a.element == 0) {
                this.f176402b.mo122415a(false);
            } else if (Math.abs(this.f176403c - this.f176401a.element) > 3) {
                this.f176402b.mo122415a(false);
            } else {
                this.f176402b.mo122415a(true);
            }
        }

        public C78494e(C89233z.C89236c cVar, AbstractC78491b bVar, int i) {
            this.f176401a = cVar;
            this.f176402b = bVar;
            this.f176403c = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.a.b$f */
    public static final class C78495f implements AbstractC24160e<C24117a<AbstractC24454c>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC78492c f176404a;

        /* renamed from: b */
        final /* synthetic */ String f176405b;

        static {
            Covode.recordClassIndex(91627);
        }

        @Override // com.facebook.p1844d.AbstractC24160e
        public final void onCancellation(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
        }

        @Override // com.facebook.p1844d.AbstractC24160e
        public final void onFailure(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
        }

        @Override // com.facebook.p1844d.AbstractC24160e
        public final void onProgressUpdate(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
        }

        @Override // com.facebook.p1844d.AbstractC24160e
        public final void onNewResult(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
            C24117a<AbstractC24454c> d;
            AbstractC24454c a;
            int duration;
            if (cVar != null && (d = cVar.mo39747d()) != null && (a = d.mo39695a()) != null && (a instanceof C24452a)) {
                C24452a aVar = (C24452a) a;
                C24325e d2 = aVar.mo40293d();
                C89219l.m154716b(d2, "");
                AbstractC24323c cVar2 = d2.f57681a;
                C89219l.m154716b(cVar2, "");
                if (cVar2.getDuration() <= 0) {
                    duration = 1;
                } else {
                    C24325e d3 = aVar.mo40293d();
                    C89219l.m154716b(d3, "");
                    AbstractC24323c cVar3 = d3.f57681a;
                    C89219l.m154716b(cVar3, "");
                    duration = cVar3.getDuration();
                }
                this.f176404a.mo122416a(this.f176405b, duration);
            }
        }

        C78495f(AbstractC78492c cVar, String str) {
            this.f176404a = cVar;
            this.f176405b = str;
        }
    }

    /* renamed from: a */
    public static ArrayList<String> m137050a(String str) {
        C89219l.m154721d(str, "");
        File[] listFiles = new File(str).listFiles();
        ArrayList<String> arrayList = new ArrayList<>();
        C89219l.m154716b(listFiles, "");
        ArrayList<File> arrayList2 = new ArrayList();
        for (File file : listFiles) {
            C89219l.m154716b(file, "");
            String absolutePath = file.getAbsolutePath();
            C89219l.m154716b(absolutePath, "");
            if (C89361p.m154929e((CharSequence) absolutePath, (CharSequence) "custom_sticker")) {
                arrayList2.add(file);
            }
        }
        for (File file2 : arrayList2) {
            C89219l.m154716b(file2, "");
            arrayList.add(file2.getAbsolutePath());
        }
        return arrayList;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.a.b$d */
    public static final class C78493d implements AbstractC78492c {

        /* renamed from: a */
        final /* synthetic */ String f176397a;

        /* renamed from: b */
        final /* synthetic */ HashMap f176398b;

        /* renamed from: c */
        final /* synthetic */ int f176399c;

        /* renamed from: d */
        final /* synthetic */ AbstractC78490a f176400d;

        static {
            Covode.recordClassIndex(91625);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.extract.p4116a.C78489b.AbstractC78492c
        /* renamed from: a */
        public final void mo122416a(String str, int i) {
            C89219l.m154721d(str, "");
            this.f176398b.put(this.f176397a, Integer.valueOf(i));
            if (this.f176398b.size() == this.f176399c) {
                this.f176400d.mo122414a(this.f176398b);
            }
        }

        C78493d(String str, HashMap hashMap, int i, AbstractC78490a aVar) {
            this.f176397a = str;
            this.f176398b = hashMap;
            this.f176399c = i;
            this.f176400d = aVar;
        }
    }

    /* renamed from: a */
    public static void m137051a(List<String> list, AbstractC78490a aVar) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        int size = list.size();
        for (T t : list) {
            if (!C80720e.m139927b((String) t)) {
                hashMap.put(t, 0);
                if (hashMap.size() == size) {
                    aVar.mo122414a(hashMap);
                }
            } else {
                C78489b bVar = f176396a;
                C78493d dVar = new C78493d(t, hashMap, size, aVar);
                AbstractC24157c<C24117a<AbstractC24454c>> a = C24428k.m46551a().mo40247e().mo40224a(C24639c.m47149a(Uri.fromFile(new File((String) t))).mo40483a(), bVar);
                C89219l.m154716b(a, "");
                a.mo39739a(new C78495f(dVar, t), Executors.newCachedThreadPool());
            }
        }
    }
}
