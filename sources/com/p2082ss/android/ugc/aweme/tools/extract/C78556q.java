package com.p2082ss.android.ugc.aweme.tools.extract;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39084ah;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78550l;
import com.p2082ss.android.ugc.tools.utils.C84891c;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.q */
public class C78556q extends AbstractC78487a {

    /* renamed from: e */
    public List<C39084ah> f176547e;

    static {
        Covode.recordClassIndex(91688);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78550l
    /* renamed from: e */
    public String mo122447e() {
        return "extract_movie";
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78487a
    /* renamed from: d */
    public final List<C78595z> mo122412d() {
        List<C39084ah> list = this.f176547e;
        if (C84904k.m145909a(list)) {
            return null;
        }
        if (list == null) {
            C89219l.m154715b();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (T t : list) {
            C78595z zVar = new C78595z();
            zVar.f176632a = t.f92283a;
            zVar.f176633b = t.f92284b;
            zVar.f176634c = t.f92285c;
            arrayList.add(zVar);
        }
        return arrayList;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.q$a */
    static final class CallableC78557a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C78556q f176548a;

        static {
            Covode.recordClassIndex(91689);
        }

        CallableC78557a(C78556q qVar) {
            this.f176548a = qVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (!C84904k.m145909a(this.f176548a.f176547e)) {
                ArrayList<C39084ah> arrayList = new ArrayList();
                ArrayList<C39084ah> arrayList2 = new ArrayList();
                List<C39084ah> list = this.f176548a.f176547e;
                if (list == null) {
                    C89219l.m154715b();
                }
                for (C39084ah ahVar : list) {
                    if (C84896h.m145866a(ahVar.f92283a, true)) {
                        arrayList.add(ahVar);
                    } else {
                        arrayList2.add(ahVar);
                    }
                }
                HashSet hashSet = new HashSet();
                for (C39084ah ahVar2 : arrayList) {
                    Bitmap a = C84891c.m145844a(ahVar2.f92283a, C78549k.f176544a);
                    if (a != null) {
                        String a2 = this.f176548a.f176393c.mo122482a();
                        C89219l.m154716b(a2, "");
                        C84891c.m145848a(a, new File(a2), 70, Bitmap.CompressFormat.JPEG);
                        hashSet.add(a2);
                    }
                }
                C78553n nVar = this.f176548a.f176393c;
                C89219l.m154716b(nVar, "");
                String str = nVar.f176546b;
                C89219l.m154716b(str, "");
                String str2 = File.separator;
                C89219l.m154716b(str2, "");
                if (!C89361p.m154876c(str, str2, false)) {
                    str = str + File.separator;
                }
                int i = 0;
                for (C39084ah ahVar3 : arrayList2) {
                    VEUtils.saveVideoFrames(ahVar3.f92283a, C78556q.m137153a(ahVar3), C78549k.f176544a[0], -1, false, str, String.valueOf(i) + "extract_frame", 1);
                    i++;
                }
                File[] listFiles = new File(str).listFiles();
                if (!(listFiles == null || listFiles.length == 0)) {
                    for (File file : listFiles) {
                        C89219l.m154716b(file, "");
                        hashSet.add(file.getAbsolutePath());
                    }
                }
                ArrayList<String> arrayList3 = new ArrayList();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next());
                }
                this.f176548a.f176391a.clearAllFrames();
                ExtractFramesModel extractFramesModel = this.f176548a.f176391a;
                ArrayList arrayList4 = new ArrayList(C89070n.m154526a((Iterable) arrayList3, 10));
                for (String str3 : arrayList3) {
                    arrayList4.add(new FrameItem(str3, 0, 0, 6, null));
                }
                ExtractFramesModel.addFrameSegment$default(extractFramesModel, arrayList4, null, 2, null);
            }
            return C89391z.f203057a;
        }
    }

    public C78556q(List<C39084ah> list) {
        this.f176547e = list;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.q$b */
    static final class C78558b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C78556q f176549a;

        /* renamed from: b */
        final /* synthetic */ AbstractC78550l.AbstractC78551a f176550b;

        static {
            Covode.recordClassIndex(91690);
        }

        C78558b(C78556q qVar, AbstractC78550l.AbstractC78551a aVar) {
            this.f176549a = qVar;
            this.f176550b = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            AbstractC78550l.AbstractC78551a aVar = this.f176550b;
            C89219l.m154716b(iVar, "");
            aVar.mo122481a(iVar.mo5535a());
            this.f176549a.mo122410a(true);
            this.f176549a.mo122408a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static int[] m137153a(C39084ah ahVar) {
        if (ahVar.f92285c == 0) {
            return C89064i.m154490a(new Integer[0]);
        }
        int i = ((int) ahVar.f92285c) / 500;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = (int) (ahVar.f92284b + ((long) (i2 * 500)));
        }
        return iArr;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78487a
    /* renamed from: a */
    public final void mo122409a(AbstractC78550l.AbstractC78551a aVar) {
        C89219l.m154721d(aVar, "");
        super.mo122409a(aVar);
        if (m137043b()) {
            C1731i.m5640b(new CallableC78557a(this), C1731i.f5562a).mo5532a((AbstractC1729g) new C78558b(this, aVar));
        }
    }
}
