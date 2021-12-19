package com.p2082ss.android.ugc.aweme.journey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.NewUserJourneyService;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.z */
public final class C57058z implements INewUserJourneyService {

    /* renamed from: a */
    public static final C57058z f129923a = new C57058z();

    /* renamed from: b */
    private final /* synthetic */ INewUserJourneyService f129924b;

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService
    /* renamed from: a */
    public final AbstractC56869p mo57260a(int i) {
        return this.f129924b.mo57260a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService
    /* renamed from: a */
    public final AbstractC58259r mo57261a() {
        return this.f129924b.mo57261a();
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService
    /* renamed from: a */
    public final Class<? extends Activity> mo57262a(Intent intent) {
        C89219l.m154721d(intent, "");
        return this.f129924b.mo57262a(intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService
    /* renamed from: a */
    public final void mo57263a(Activity activity, Intent intent) {
        this.f129924b.mo57263a(activity, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService
    /* renamed from: a */
    public final void mo57264a(Activity activity, boolean z, boolean z2) {
        C89219l.m154721d(activity, "");
        this.f129924b.mo57264a(activity, z, z2);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService
    /* renamed from: a */
    public final void mo57265a(Context context) {
        C89219l.m154721d(context, "");
        this.f129924b.mo57265a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService
    /* renamed from: a */
    public final boolean mo57266a(Activity activity) {
        C89219l.m154721d(activity, "");
        return this.f129924b.mo57266a(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService
    /* renamed from: a */
    public final boolean mo57267a(boolean z) {
        return this.f129924b.mo57267a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService
    /* renamed from: b */
    public final void mo57268b() {
        this.f129924b.mo57268b();
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.INewUserJourneyService
    /* renamed from: b */
    public final boolean mo57269b(Activity activity) {
        C89219l.m154721d(activity, "");
        return this.f129924b.mo57269b(activity);
    }

    static {
        Covode.recordClassIndex(66948);
    }

    private C57058z() {
        INewUserJourneyService c = NewUserJourneyService.m65387c();
        C89219l.m154716b(c, "");
        this.f129924b = c;
    }
}
