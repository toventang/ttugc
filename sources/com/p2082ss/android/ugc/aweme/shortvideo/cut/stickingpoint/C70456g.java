package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.content.Context;
import android.provider.MediaStore;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.services.IFoundationAVService;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70407b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3801b.C70418a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70437c;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70443i;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.g */
public final class C70456g {

    /* renamed from: a */
    public static final C70456g f157422a = new C70456g();

    /* renamed from: b */
    public static final C70457a f157423b = new C70457a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.g$a */
    public static final class C70457a {
        static {
            Covode.recordClassIndex(82900);
        }

        private C70457a() {
        }

        public /* synthetic */ C70457a(byte b) {
            this();
        }
    }

    private C70456g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.g$b */
    public static final class CallableC70458b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ int f157424a;

        /* renamed from: b */
        final /* synthetic */ String f157425b;

        static {
            Covode.recordClassIndex(82901);
        }

        CallableC70458b(int i, String str) {
            this.f157424a = i;
            this.f157425b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<C69905c> call() {
            try {
                return C63253l.f143623a.mo73306b().mo101537a(this.f157424a, this.f157425b);
            } catch (Exception e) {
                C70464i.m124295a(false, e);
                e.printStackTrace();
                return null;
            }
        }
    }

    static {
        Covode.recordClassIndex(82899);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.g$d */
    public static final class C70460d implements IFoundationAVService.IFetchResourcesListener {

        /* renamed from: a */
        final /* synthetic */ C70456g f157429a;

        /* renamed from: b */
        final /* synthetic */ AbstractC70443i f157430b;

        /* renamed from: c */
        final /* synthetic */ int f157431c;

        /* renamed from: d */
        final /* synthetic */ String f157432d;

        /* renamed from: e */
        final /* synthetic */ Context f157433e;

        static {
            Covode.recordClassIndex(82903);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.g$d$a */
        public static final class C70461a implements AbstractC70437c {

            /* renamed from: a */
            final /* synthetic */ C70460d f157434a;

            static {
                Covode.recordClassIndex(82904);
            }

            /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.g$d$a$a */
            public static final class C70462a extends C70407b {

                /* renamed from: a */
                final /* synthetic */ C70461a f157435a;

                static {
                    Covode.recordClassIndex(82905);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                C70462a(C70461a aVar) {
                    this.f157435a = aVar;
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70436b, com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70407b
                /* renamed from: a */
                public final void mo110905a(C69905c cVar, boolean z) {
                    if (!z) {
                        AbstractC70443i iVar = this.f157435a.f157434a.f157430b;
                        if (iVar != null) {
                            iVar.mo111000b();
                        }
                    } else if (this.f157435a.f157434a.f157430b != null) {
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70436b, com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70407b
                /* renamed from: b */
                public final void mo110906b(C69905c cVar, boolean z) {
                    if (z) {
                        AbstractC70443i iVar = this.f157435a.f157434a.f157430b;
                        if (iVar != null) {
                            iVar.mo110997a(cVar);
                            return;
                        }
                        return;
                    }
                    AbstractC70443i iVar2 = this.f157435a.f157434a.f157430b;
                    if (iVar2 != null) {
                        iVar2.mo111002c();
                    }
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C70461a(C70460d dVar) {
                this.f157434a = dVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70437c
            /* renamed from: a */
            public final void mo110907a(Exception exc) {
                AbstractC70443i iVar = this.f157434a.f157430b;
                if (iVar != null) {
                    iVar.mo111001b(exc);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70437c
            /* renamed from: a */
            public final void mo110908a(List<? extends C69905c> list) {
                C69905c cVar = null;
                if (C84904k.m145909a(list)) {
                    AbstractC70443i iVar = this.f157434a.f157430b;
                    if (iVar != null) {
                        iVar.mo111001b(null);
                        return;
                    }
                    return;
                }
                AbstractC70443i iVar2 = this.f157434a.f157430b;
                if (iVar2 != null) {
                    iVar2.mo110999a(list);
                }
                Context context = this.f157434a.f157433e;
                if (list != null) {
                    cVar = (C69905c) list.get(0);
                }
                C70418a.m124204a(context, cVar, new C70462a(this));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onFailed(Exception exc) {
            C89219l.m154721d(exc, "");
            AbstractC70443i iVar = this.f157430b;
            if (iVar != null) {
                iVar.mo110998a(exc);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onSuccess(String[] strArr) {
            C89219l.m154721d(strArr, "");
            AbstractC70443i iVar = this.f157430b;
            if (iVar != null) {
                iVar.mo110996a();
            }
            this.f157429a.mo111022a(this.f157431c, this.f157432d, new C70461a(this));
        }

        C70460d(C70456g gVar, AbstractC70443i iVar, int i, String str, Context context) {
            this.f157429a = gVar;
            this.f157430b = iVar;
            this.f157431c = i;
            this.f157432d = str;
            this.f157433e = context;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.g$c */
    public static final class C70459c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C70456g f157426a;

        /* renamed from: b */
        final /* synthetic */ AbstractC70437c f157427b;

        /* renamed from: c */
        final /* synthetic */ int f157428c;

        static {
            Covode.recordClassIndex(82902);
        }

        C70459c(C70456g gVar, AbstractC70437c cVar, int i) {
            this.f157426a = gVar;
            this.f157427b = cVar;
            this.f157428c = i;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<List<C69905c>> iVar) {
            if (iVar == null || iVar.mo5545d() == null) {
                AbstractC70437c cVar = this.f157427b;
                if (cVar != null) {
                    cVar.mo110907a(new Exception());
                }
            } else if (C84904k.m145909a(iVar.mo5545d())) {
                AbstractC70437c cVar2 = this.f157427b;
                if (cVar2 != null) {
                    cVar2.mo110907a(new Exception());
                }
            } else {
                List<C69905c> d = iVar.mo5545d();
                C89219l.m154716b(d, "");
                List<C69905c> g = C89070n.m154585g((Collection) d);
                for (C69905c cVar3 : g) {
                    C70455f.m124268a(cVar3);
                }
                AbstractC70437c cVar4 = this.f157427b;
                if (cVar4 != null) {
                    cVar4.mo110908a(C70456g.m124276a(g, this.f157428c));
                }
                C70464i.m124295a(true, null);
            }
            return null;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x0013 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List, java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.c>, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List<com.ss.android.ugc.aweme.shortvideo.c>] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    /* renamed from: b */
    private static List<C69905c> m124277b(List<? extends C69905c> list, int i) {
        int i2;
        int minSeg;
        if (!C84904k.m145909a(list)) {
            if (list == 0) {
                C89219l.m154715b();
            }
            if (list.size() > 10) {
                Collections.shuffle(list);
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    i2 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    C69905c cVar = (C69905c) it.next();
                    if (cVar.getStickPointMusicAlg() == null) {
                        minSeg = 0;
                    } else {
                        minSeg = cVar.getStickPointMusicAlg().getMinSeg();
                    }
                    if ((cVar.getStickPointMusicAlg() == null || (i2 = cVar.getStickPointMusicAlg().getMaxSeg()) <= 0) && minSeg <= 0) {
                        arrayList.add(cVar);
                    } else if (minSeg <= i && i2 >= i) {
                        arrayList.add(cVar);
                    }
                }
                if (arrayList.size() <= 10) {
                    return arrayList;
                }
                list = new ArrayList<>(10);
                do {
                    list.add(arrayList.get(i2));
                    i2++;
                } while (i2 < 10);
            }
        }
        return list;
    }

    /* renamed from: a */
    public static List<C69905c> m124276a(List<C69905c> list, int i) {
        List<C69905c> b;
        C69905c cVar = C70005cr.m123611a().f156482a;
        List<C69905c> list2 = null;
        if (cVar != null) {
            C70455f.m124268a(cVar);
            if (C84904k.m145909a(list)) {
                list2 = new ArrayList<>();
            } else {
                if (list == null) {
                    C89219l.m154715b();
                }
                Iterator<C69905c> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C69905c next = it.next();
                    if (next.getId() == cVar.getId()) {
                        list.remove(next);
                        break;
                    }
                }
                List<C69905c> b2 = m124277b(list, i);
                if (b2 != null) {
                    list2 = C89070n.m154585g((Collection) b2);
                }
            }
            if (cVar.path != null) {
                String str = cVar.path;
                if (!str.startsWith(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.toString()) && !str.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) && !str.startsWith(MediaStore.Video.Media.EXTERNAL_CONTENT_URI.toString()) && list2 != null) {
                    list2.add(0, cVar);
                }
            }
            return list2;
        } else if (!C84904k.m145909a(list) && (b = m124277b(list, i)) != null) {
            return C89070n.m154585g((Collection) b);
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo111022a(int i, String str, AbstractC70437c cVar) {
        C1731i.m5640b(new CallableC70458b(i, str), C1731i.f5562a).mo5534a(new C70459c(this, cVar, i), C1731i.f5564c, null);
    }
}
