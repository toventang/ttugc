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
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.story.IStoryService */
public interface IStoryService {
    static {
        Covode.recordClassIndex(89391);
    }

    /* renamed from: a */
    AbstractC34835bi mo120135a(ViewGroup viewGroup, AbstractC84295k kVar, AbstractC35440cd cdVar, ViewGroup viewGroup2, ViewGroup viewGroup3, ViewGroup viewGroup4, AbstractC89172b<? super String, ? extends View> bVar);

    /* renamed from: a */
    IStoryViewerListViewModel mo120136a(ActivityC0945e eVar, AbstractC1183ag agVar);

    /* renamed from: a */
    EnumC76739a mo120137a(String str, String str2);

    /* renamed from: a */
    AbstractC88979t<BaseResponse> mo120138a(String str, int i);

    /* renamed from: a */
    Object mo120139a(AbstractC35440cd cdVar);

    /* renamed from: a */
    void mo120140a(int i);

    /* renamed from: a */
    void mo120141a(ActivityC0945e eVar);

    /* renamed from: a */
    void mo120142a(ActivityC0945e eVar, String str);

    /* renamed from: a */
    void mo120143a(ActivityC0945e eVar, String str, Aweme aweme);

    /* renamed from: a */
    void mo120144a(String str, Aweme aweme);

    /* renamed from: a */
    void mo120145a(int[] iArr);

    /* renamed from: a */
    boolean mo120146a();

    /* renamed from: a */
    boolean mo120147a(Aweme aweme);

    /* renamed from: a */
    boolean mo120148a(String str);

    /* renamed from: b */
    int mo120149b();

    /* renamed from: b */
    AbstractC76590b mo120150b(String str);

    /* renamed from: b */
    AbstractC76590b mo120151b(String str, String str2);

    /* renamed from: b */
    Object mo120152b(AbstractC35440cd cdVar);

    /* renamed from: c */
    int mo120153c();

    /* renamed from: c */
    Object mo120154c(AbstractC35440cd cdVar);

    /* renamed from: c */
    void mo120155c(String str);

    /* renamed from: d */
    AbstractC76504c mo120156d();

    /* renamed from: e */
    AbstractC76444b mo120157e();

    /* renamed from: f */
    AbstractC77389a mo120158f();

    /* renamed from: g */
    void mo120159g();

    /* renamed from: h */
    int[] mo120160h();

    /* renamed from: i */
    boolean mo120161i();

    /* renamed from: j */
    void mo120162j();

    /* renamed from: k */
    int mo120163k();
}
