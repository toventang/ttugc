package com.p2082ss.android.ugc.aweme.tools.beauty.p4095g;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.C41101a;
import com.p2082ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfoCopy;
import com.p2082ss.android.ugc.aweme.dependence.beauty.p2741b.C41099d;
import com.p2082ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77852b;
import com.p2082ss.android.ugc.aweme.tools.beauty.EnumC77817a;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78051c;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.m */
public interface AbstractC77967m {

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.m$b */
    public interface AbstractC77969b {
        static {
            Covode.recordClassIndex(91058);
        }

        /* renamed from: a */
        boolean mo121535a(BeautyFilterConfig beautyFilterConfig, BeautyCategoryExtra beautyCategoryExtra);

        /* renamed from: a */
        boolean mo121536a(BeautyFilterConfig beautyFilterConfig, List<BeautyCategory> list);

        /* renamed from: b */
        boolean mo121537b(BeautyFilterConfig beautyFilterConfig, BeautyCategoryExtra beautyCategoryExtra);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.m$c */
    public interface AbstractC77970c {
        static {
            Covode.recordClassIndex(91059);
        }

        /* renamed from: a */
        void mo121567a(List<BeautyComposerInfo> list);

        /* renamed from: a */
        void mo121568a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2);
    }

    static {
        Covode.recordClassIndex(91056);
    }

    /* renamed from: a */
    float mo121583a(ComposerBeauty composerBeauty, String str, float f);

    /* renamed from: a */
    List<BeautyCategory> mo121584a();

    /* renamed from: a */
    void mo121586a(ComposerBeauty composerBeauty);

    /* renamed from: a */
    void mo121587a(ComposerBeauty composerBeauty, AbstractC77970c cVar);

    /* renamed from: a */
    void mo121588a(ComposerBeauty composerBeauty, boolean z);

    /* renamed from: a */
    void mo121589a(C77852b bVar);

    /* renamed from: a */
    void mo121590a(AbstractC77969b bVar);

    /* renamed from: a */
    void mo121591a(String str);

    /* renamed from: a */
    void mo121592a(String str, AbstractC78051c.AbstractC78052a aVar);

    /* renamed from: a */
    void mo121593a(String str, boolean z);

    /* renamed from: a */
    void mo121597a(boolean z);

    /* renamed from: a */
    void mo121598a(boolean z, EnumC77817a aVar);

    /* renamed from: a */
    boolean mo121599a(BeautyCategory beautyCategory);

    /* renamed from: b */
    C41099d<Boolean> mo121600b();

    /* renamed from: b */
    List<BeautyComposerInfo> mo121601b(ComposerBeauty composerBeauty);

    /* renamed from: b */
    void mo121602b(ComposerBeauty composerBeauty, String str, float f);

    /* renamed from: b */
    boolean mo121604b(String str);

    /* renamed from: c */
    C41099d<List<BeautyComposerInfo>> mo121605c();

    /* renamed from: c */
    void mo121606c(ComposerBeauty composerBeauty);

    /* renamed from: d */
    C77971n<BeautyComposerInfo> mo121609d();

    /* renamed from: e */
    Map<String, C77971n<BeautyComposerInfo>> mo121611e();

    /* renamed from: e */
    boolean mo121612e(ComposerBeauty composerBeauty);

    /* renamed from: f */
    C41099d<ComposerBeauty> mo121613f();

    /* renamed from: f */
    void mo121614f(ComposerBeauty composerBeauty);

    /* renamed from: g */
    C77903b mo121615g();

    /* renamed from: g */
    void mo121616g(ComposerBeauty composerBeauty);

    /* renamed from: h */
    C41099d<C0484a<String, Integer>> mo121617h();

    /* renamed from: h */
    String mo121618h(ComposerBeauty composerBeauty);

    /* renamed from: i */
    C41099d<C77972o<ComposerBeauty>> mo121619i();

    /* renamed from: j */
    EnumC77817a mo121621j();

    /* renamed from: k */
    void mo121624k(ComposerBeauty composerBeauty);

    /* renamed from: l */
    void mo121625l();

    /* renamed from: l */
    void mo121626l(ComposerBeauty composerBeauty);

    /* renamed from: m */
    void mo121628m(ComposerBeauty composerBeauty);

    /* renamed from: n */
    C41099d<List<BeautyComposerInfo>> mo121629n();

    /* renamed from: o */
    C41101a mo121631o();

    /* renamed from: p */
    ComposerBeautyBuriedInfoCopy mo121632p();

    /* renamed from: q */
    boolean mo121633q();

    /* renamed from: r */
    BeautyMetadata mo121634r();

    /* renamed from: s */
    List<ComposerBeauty> mo121635s();

    /* renamed from: t */
    void mo121636t();

    /* renamed from: u */
    BeautyFilterConfig mo121637u();

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g.m$a */
    public static final class C77968a {
        static {
            Covode.recordClassIndex(91057);
        }

        /* renamed from: a */
        public static /* synthetic */ void m136228a(AbstractC77967m mVar, boolean z, EnumC77817a aVar, int i) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                aVar = mVar.mo121621j();
            }
            mVar.mo121598a(z, aVar);
        }
    }
}
