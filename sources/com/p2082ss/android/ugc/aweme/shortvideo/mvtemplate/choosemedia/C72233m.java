package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.C59187c;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2309ak.AbstractC33482a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70463h;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72195br;
import java.util.ArrayList;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89386u;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.m */
public final class C72233m implements AbstractC72263v {

    /* renamed from: a */
    public final Activity f161934a;

    /* renamed from: b */
    public final long f161935b;

    /* renamed from: c */
    public final long f161936c;

    /* renamed from: d */
    private final AbstractC89244h f161937d = C89250i.m154773a((AbstractC89171a) new C72234a(this));

    static {
        Covode.recordClassIndex(84898);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v
    /* renamed from: a */
    public final void mo114427a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.m$a */
    static final class C72234a extends AbstractC89220m implements AbstractC89171a<AbstractC33482a> {

        /* renamed from: a */
        final /* synthetic */ C72233m f161938a;

        static {
            Covode.recordClassIndex(84899);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72234a(C72233m mVar) {
            super(0);
            this.f161938a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC33482a invoke() {
            return C63244g.m114602a().mo73266L().mo59564a(this.f161938a.f161934a, this.f161938a.f161935b, this.f161938a.f161936c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v
    /* renamed from: a */
    public final void mo114428a(int i, Intent intent) {
        ShortVideoContext shortVideoContext;
        C89219l.m154721d(intent, "");
        if (i == 1) {
            long longExtra = intent.getLongExtra("extra_start_enter_edit_page", -1);
            int intExtra = intent.getIntExtra("extra_stick_point_type", 0);
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            if (!(parcelableArrayListExtra == null || (shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context")) == null)) {
                C89386u uVar = C72182bp.m127372a(this.f161934a, parcelableArrayListExtra, this.f161935b, 3600000);
                boolean booleanValue = ((Boolean) uVar.component1()).booleanValue();
                int intValue = ((Number) uVar.component2()).intValue();
                long longValue = ((Number) uVar.component3()).longValue();
                if (booleanValue) {
                    C59187c.f134693a.mo96693b();
                    int size = parcelableArrayListExtra.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C59187c.f134693a.mo96692a((MediaModel) parcelableArrayListExtra.get(i2));
                    }
                    C70463h.m124286a(shortVideoContext.f155831p, shortVideoContext.f155830o);
                    C72200bs.m127399a(shortVideoContext, parcelableArrayListExtra, intValue, (int) longValue);
                    C72200bs.m127400a(parcelableArrayListExtra);
                    ((AbstractC33482a) this.f161937d.getValue()).mo59563a(parcelableArrayListExtra, intent, C72195br.C72196a.m127388a(this.f161934a, shortVideoContext, intExtra, longExtra), null);
                }
            }
        }
    }

    public C72233m(Activity activity, long j, long j2) {
        C89219l.m154721d(activity, "");
        this.f161934a = activity;
        this.f161935b = j;
        this.f161936c = j2;
    }
}
