package com.p2082ss.android.ugc.aweme.story;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1183ag;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34835bi;
import com.p2082ss.android.ugc.aweme.AbstractC35440cd;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.story.api.AbstractC76444b;
import com.p2082ss.android.ugc.aweme.story.api.IStoryViewerListViewModel;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76504c;
import com.p2082ss.android.ugc.aweme.story.p4027e.EnumC76739a;
import com.p2082ss.android.ugc.aweme.story.publish.AbstractC77389a;
import com.p2082ss.android.ugc.aweme.story.service.StoryServiceImpl;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.g */
public final class C77260g implements IStoryService {

    /* renamed from: a */
    public static final C77260g f173332a = new C77260g();

    /* renamed from: b */
    private final /* synthetic */ IStoryService f173333b;

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final AbstractC34835bi mo120135a(ViewGroup viewGroup, AbstractC84295k kVar, AbstractC35440cd cdVar, ViewGroup viewGroup2, ViewGroup viewGroup3, ViewGroup viewGroup4, AbstractC89172b<? super String, ? extends View> bVar) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(cdVar, "");
        C89219l.m154721d(viewGroup2, "");
        C89219l.m154721d(viewGroup3, "");
        C89219l.m154721d(viewGroup4, "");
        return this.f173333b.mo120135a(viewGroup, kVar, cdVar, viewGroup2, viewGroup3, viewGroup4, bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final IStoryViewerListViewModel mo120136a(ActivityC0945e eVar, AbstractC1183ag agVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(agVar, "");
        return this.f173333b.mo120136a(eVar, agVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final EnumC76739a mo120137a(String str, String str2) {
        C89219l.m154721d(str, "");
        return this.f173333b.mo120137a(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final AbstractC88979t<BaseResponse> mo120138a(String str, int i) {
        C89219l.m154721d(str, "");
        return this.f173333b.mo120138a(str, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final Object mo120139a(AbstractC35440cd cdVar) {
        C89219l.m154721d(cdVar, "");
        return this.f173333b.mo120139a(cdVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final void mo120140a(int i) {
        this.f173333b.mo120140a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final void mo120141a(ActivityC0945e eVar) {
        this.f173333b.mo120141a(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final void mo120142a(ActivityC0945e eVar, String str) {
        C89219l.m154721d(str, "");
        this.f173333b.mo120142a(eVar, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final void mo120143a(ActivityC0945e eVar, String str, Aweme aweme) {
        C89219l.m154721d(str, "");
        this.f173333b.mo120143a(eVar, str, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final void mo120144a(String str, Aweme aweme) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aweme, "");
        this.f173333b.mo120144a(str, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final void mo120145a(int[] iArr) {
        C89219l.m154721d(iArr, "");
        this.f173333b.mo120145a(iArr);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final boolean mo120146a() {
        return this.f173333b.mo120146a();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final boolean mo120147a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        return this.f173333b.mo120147a(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: a */
    public final boolean mo120148a(String str) {
        C89219l.m154721d(str, "");
        return this.f173333b.mo120148a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: b */
    public final int mo120149b() {
        return this.f173333b.mo120149b();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: b */
    public final AbstractC76590b mo120150b(String str) {
        C89219l.m154721d(str, "");
        return this.f173333b.mo120150b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: b */
    public final AbstractC76590b mo120151b(String str, String str2) {
        C89219l.m154721d(str, "");
        return this.f173333b.mo120151b(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: b */
    public final Object mo120152b(AbstractC35440cd cdVar) {
        C89219l.m154721d(cdVar, "");
        return this.f173333b.mo120152b(cdVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: c */
    public final int mo120153c() {
        return this.f173333b.mo120153c();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: c */
    public final Object mo120154c(AbstractC35440cd cdVar) {
        C89219l.m154721d(cdVar, "");
        return this.f173333b.mo120154c(cdVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: c */
    public final void mo120155c(String str) {
        C89219l.m154721d(str, "");
        this.f173333b.mo120155c(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: d */
    public final AbstractC76504c mo120156d() {
        return this.f173333b.mo120156d();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: e */
    public final AbstractC76444b mo120157e() {
        return this.f173333b.mo120157e();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: f */
    public final AbstractC77389a mo120158f() {
        return this.f173333b.mo120158f();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: g */
    public final void mo120159g() {
        this.f173333b.mo120159g();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: h */
    public final int[] mo120160h() {
        return this.f173333b.mo120160h();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: i */
    public final boolean mo120161i() {
        return this.f173333b.mo120161i();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: j */
    public final void mo120162j() {
        this.f173333b.mo120162j();
    }

    @Override // com.p2082ss.android.ugc.aweme.story.IStoryService
    /* renamed from: k */
    public final int mo120163k() {
        return this.f173333b.mo120163k();
    }

    static {
        Covode.recordClassIndex(90277);
    }

    private C77260g() {
        IStoryService l = StoryServiceImpl.m135668l();
        C89219l.m154716b(l, "");
        this.f173333b = l;
    }
}
