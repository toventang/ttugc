package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a;

import android.content.Intent;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68099i;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72264w;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IPhotoMvFailsStrategy;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.AbstractC78911f;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.C78913g;
import com.p2082ss.android.ugc.aweme.view.DialogC81117a;
import dmt.p4542av.video.SingleImageCoverBitmapData;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.c */
public final class C78896c implements AbstractC72263v {

    /* renamed from: a */
    public final ActivityC0945e f177308a;

    /* renamed from: b */
    private DialogC81117a f177309b;

    /* renamed from: c */
    private final boolean f177310c = C68099i.m120395a();

    static {
        Covode.recordClassIndex(92045);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v
    /* renamed from: a */
    public final void mo114427a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.c$a */
    static final class C78897a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C78896c f177311a;

        static {
            Covode.recordClassIndex(92046);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78897a(C78896c cVar) {
            super(0);
            this.f177311a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f177311a.mo122718b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo122718b() {
        DialogC81117a aVar;
        DialogC81117a aVar2 = this.f177309b;
        if (aVar2 != null && aVar2.isShowing() && (aVar = this.f177309b) != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.c$b */
    static final class C78898b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C78896c f177312a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f177313b;

        /* renamed from: c */
        final /* synthetic */ int f177314c;

        /* renamed from: d */
        final /* synthetic */ int f177315d = -1;

        /* renamed from: e */
        final /* synthetic */ Intent f177316e;

        static {
            Covode.recordClassIndex(92047);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78898b(C78896c cVar, ArrayList arrayList, int i, Intent intent) {
            super(0);
            this.f177312a = cVar;
            this.f177313b = arrayList;
            this.f177314c = i;
            this.f177316e = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f177312a.mo122718b();
            if (this.f177313b.size() > 1) {
                ((IPhotoMvFailsStrategy) ServiceManager.get().getService(IPhotoMvFailsStrategy.class)).multiPicOriginStrategy(this.f177312a.f177308a, this.f177314c, this.f177315d, this.f177316e);
            } else {
                ((IPhotoMvFailsStrategy) ServiceManager.get().getService(IPhotoMvFailsStrategy.class)).singlePicOriginStrategy(this.f177312a.f177308a, this.f177314c, this.f177315d, this.f177316e);
            }
            return C89391z.f203057a;
        }
    }

    public C78896c(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f177308a = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v
    /* renamed from: a */
    public final void mo114428a(int i, Intent intent) {
        boolean z;
        C89219l.m154721d(intent, "");
        if (i == 1) {
            Parcelable parcelableExtra = intent.getParcelableExtra("key_short_video_context");
            if (parcelableExtra == null) {
                C89219l.m154715b();
            }
            ShortVideoContext shortVideoContext = (ShortVideoContext) parcelableExtra;
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            if (parcelableArrayListExtra == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(parcelableArrayListExtra, "");
            int intExtra = intent.getIntExtra("key_choose_media_item_size", 0);
            if (this.f177309b == null) {
                DialogC81117a aVar = new DialogC81117a(this.f177308a);
                this.f177309b = aVar;
                aVar.setCancelable(false);
            }
            DialogC81117a aVar2 = this.f177309b;
            if (aVar2 != null) {
                aVar2.show();
            }
            ActivityC0945e eVar = this.f177308a;
            if (eVar instanceof AbstractC72264w) {
                z = ((AbstractC72264w) eVar).mo114267i();
            } else {
                z = true;
            }
            if (this.f177310c) {
                Object obj = parcelableArrayListExtra.get(0);
                C89219l.m154716b(obj, "");
                String str = ((MediaModel) obj).f134662b;
                C89219l.m154716b(str, "");
                Object obj2 = parcelableArrayListExtra.get(0);
                C89219l.m154716b(obj2, "");
                String str2 = ((MediaModel) obj2).f134661a;
                C89219l.m154716b(str2, "");
                int parseInt = Integer.parseInt(str2);
                Object obj3 = parcelableArrayListExtra.get(0);
                C89219l.m154716b(obj3, "");
                long j = ((MediaModel) obj3).f134666f;
                Object obj4 = parcelableArrayListExtra.get(0);
                C89219l.m154716b(obj4, "");
                int i2 = ((MediaModel) obj4).f134667g;
                Object obj5 = parcelableArrayListExtra.get(0);
                C89219l.m154716b(obj5, "");
                int i3 = ((MediaModel) obj5).f134672l;
                Object obj6 = parcelableArrayListExtra.get(0);
                C89219l.m154716b(obj6, "");
                shortVideoContext.f155786aT = new SingleImageCoverBitmapData(str, intExtra, parseInt, j, i2, i3, ((MediaModel) obj6).f134673m, null, 128, null);
            }
            AbstractC78911f.C78912a aVar3 = new AbstractC78911f.C78912a(this.f177308a, shortVideoContext, parcelableArrayListExtra, z, new C78897a(this), new C78898b(this, parcelableArrayListExtra, i, intent));
            C89219l.m154721d(aVar3, "");
            AbstractC78911f.C78912a aVar4 = aVar3;
            C78901e eVar2 = new C78901e(aVar4.f177379a, false);
            ShortVideoContext shortVideoContext2 = aVar4.f177380b;
            ArrayList<MediaModel> arrayList = aVar4.f177381c;
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().f134662b);
            }
            eVar2.mo122723a(shortVideoContext2, arrayList2, new C78913g.C78914a(aVar3), false, Long.valueOf(System.currentTimeMillis()), aVar4.f177382d, aVar4.f177381c);
            ActivityC0945e eVar3 = this.f177308a;
            if (eVar3 instanceof AbstractC72264w) {
                ((AbstractC72264w) eVar3).mo114266g();
            }
        }
    }
}
