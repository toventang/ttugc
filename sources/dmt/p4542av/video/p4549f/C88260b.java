package dmt.p4542av.video.p4549f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46416g;
import com.p2082ss.android.ugc.aweme.effectplatform.C46427p;
import com.p2082ss.android.ugc.aweme.effectplatform.C46438v;
import com.p2082ss.android.ugc.aweme.services.IFoundationAVService;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b.C70943g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a;
import java.util.Arrays;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.f.b */
public final class C88260b implements AbstractC73799a {

    /* renamed from: a */
    private final AbstractC89244h f200299a = C89250i.m154773a((AbstractC89171a) C88262b.f200300a);

    static {
        Covode.recordClassIndex(104295);
    }

    /* renamed from: c */
    private final AbstractC46416g m153375c() {
        return (AbstractC46416g) this.f200299a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: b */
    public final boolean mo88344b() {
        return false;
    }

    /* renamed from: dmt.av.video.f.b$a */
    public static final class C88261a implements IFoundationAVService.IFetchResourcesListener {
        static {
            Covode.recordClassIndex(104296);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onFailed(Exception exc) {
            C89219l.m154721d(exc, "");
        }

        C88261a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onSuccess(String[] strArr) {
            C89219l.m154721d(strArr, "");
            List b = C89070n.m154522b(Arrays.copyOf(strArr, strArr.length));
            C89219l.m154721d(b, "");
            C46438v.f108209a.addAll(b);
        }
    }

    /* renamed from: dmt.av.video.f.b$b */
    static final class C88262b extends AbstractC89220m implements AbstractC89171a<AbstractC46416g> {

        /* renamed from: a */
        public static final C88262b f200300a = new C88262b();

        static {
            Covode.recordClassIndex(104297);
        }

        C88262b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC46416g invoke() {
            return new C46427p();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: a */
    public final void mo88343a() {
        m153375c().mo78946a(new C88261a());
        if (C70943g.m125240a()) {
            m153375c().mo78947a(new String[]{"lens_hdr"}, null);
        }
    }
}
