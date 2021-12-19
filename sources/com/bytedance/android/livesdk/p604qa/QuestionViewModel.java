package com.bytedance.android.livesdk.p604qa;

import androidx.lifecycle.LiveData;
import androidx.p053i.AbstractC1012d;
import androidx.p053i.AbstractC1036i;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: com.bytedance.android.livesdk.qa.QuestionViewModel */
public class QuestionViewModel extends PagingViewModel<C10188af> {

    /* renamed from: a */
    C88960c<Object> f24653a = new C88960c<>();

    /* renamed from: i */
    LiveData<AbstractC1036i<C10188af>> f24654i;

    /* renamed from: j */
    public C10179ae f24655j;

    /* renamed from: k */
    AbstractC1012d.AbstractC1013a f24656k;

    /* renamed from: l */
    AbstractC1036i.C1042d f24657l;

    static {
        Covode.recordClassIndex(11738);
    }

    @Override // com.bytedance.android.live.core.paging.viewmodel.PagingViewModel
    /* renamed from: b */
    public final void mo9376b() {
        this.f24653a.onNext(C11195i.f26825c);
    }

    public QuestionViewModel() {
        AbstractC1036i.C1042d.C1043a aVar = new AbstractC1036i.C1042d.C1043a();
        aVar.f3664b = 2;
        aVar.f3663a = 50;
        this.f24657l = aVar.mo3756a();
    }

    /* renamed from: a */
    public final void mo17011a(Room room, boolean z, boolean z2) {
        this.f24655j = new C10179ae(this.f10975e, this.f10973c, this.f10974d, ((PagingViewModel) this).f10972b, this.f24653a);
        this.f24656k = new AbstractC1012d.AbstractC1013a() {
            /* class com.bytedance.android.livesdk.p604qa.QuestionViewModel.C101731 */

            static {
                Covode.recordClassIndex(11739);
            }

            @Override // androidx.p053i.AbstractC1012d.AbstractC1013a
            /* renamed from: a */
            public final AbstractC1012d mo3720a() {
                return QuestionViewModel.this.f24655j;
            }
        };
        this.f24655j.mo17013a(room);
        this.f24655j.f24665h = z;
        this.f24655j.f24666i = z2;
    }
}
