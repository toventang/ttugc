package com.p2082ss.android.ugc.aweme.mediachoose;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59180g;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.widgetcompat.ProgressDialogC81636a;
import com.p2082ss.android.ugc.tools.view.widget.C85056k;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VEUtils;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.a */
public final class C59141a implements AbstractC59180g {

    /* renamed from: a */
    boolean f134568a = true;

    /* renamed from: b */
    private String f134569b = "";

    /* renamed from: c */
    private final Context f134570c;

    static {
        Covode.recordClassIndex(69499);
    }

    @Override // com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59180g
    /* renamed from: a */
    public final void mo96648a() {
        this.f134568a = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mediachoose.a$a */
    public static final class CallableC59142a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ MediaModel f134571a;

        static {
            Covode.recordClassIndex(69500);
        }

        CallableC59142a(MediaModel mediaModel) {
            this.f134571a = mediaModel;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return Integer.valueOf(VEUtils.isCanImport(this.f134571a.f134662b));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59180g
    /* renamed from: a */
    public final void mo96650a(String str) {
        C89219l.m154721d(str, "");
        this.f134569b = str;
    }

    public C59141a(Context context) {
        C89219l.m154721d(context, "");
        this.f134570c = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mediachoose.a$b */
    public static final class C59143b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C59141a f134572a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f134573b;

        /* renamed from: c */
        final /* synthetic */ ProgressDialogC81636a f134574c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f134575d;

        /* renamed from: e */
        final /* synthetic */ long f134576e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89172b f134577f;

        static {
            Covode.recordClassIndex(69501);
        }

        C59143b(C59141a aVar, MediaModel mediaModel, ProgressDialogC81636a aVar2, AbstractC89172b bVar, long j, AbstractC89172b bVar2) {
            this.f134572a = aVar;
            this.f134573b = mediaModel;
            this.f134574c = aVar2;
            this.f134575d = bVar;
            this.f134576e = j;
            this.f134577f = bVar2;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            Integer num = (Integer) iVar.mo5545d();
            String a = AbstractC59180g.C59181a.m108676a(this.f134573b.f134664d);
            ProgressDialogC81636a aVar = this.f134574c;
            if (aVar != null) {
                C85056k.m146253b(aVar);
            }
            if (num.intValue() >= 0) {
                if (num.intValue() > 0) {
                    this.f134573b.f134668h = (long) num.intValue();
                }
                this.f134575d.invoke(new C59179f(true, "Editor1VideoLegalChecker", System.currentTimeMillis() - this.f134576e, a, 0, ""));
                return null;
            }
            C73991bj.m130128a("Editor1VideoLegalChecker ImportError:".concat(String.valueOf(num)));
            AbstractC89172b bVar = this.f134577f;
            C89219l.m154716b(num, "");
            bVar.invoke(new C59179f(false, "Editor1VideoLegalChecker", System.currentTimeMillis() - this.f134576e, a, num.intValue(), ""));
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59180g
    /* renamed from: a */
    public final void mo96649a(MediaModel mediaModel, long j, long j2, AbstractC89172b<? super C59179f, C89391z> bVar, AbstractC89172b<? super C59179f, C89391z> bVar2) {
        ProgressDialogC81636a aVar;
        C89219l.m154721d(mediaModel, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f134568a) {
            Context context = this.f134570c;
            aVar = ProgressDialogC81636a.m141497a(context, context.getString(R.string.etw));
        } else {
            aVar = null;
        }
        C1731i.m5640b(new CallableC59142a(mediaModel), C1731i.f5562a).mo5534a(new C59143b(this, mediaModel, aVar, bVar, currentTimeMillis, bVar2), C1731i.f5564c, null);
    }
}
