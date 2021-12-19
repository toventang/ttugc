package com.p2082ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatform.C46432r;
import com.p2082ss.android.ugc.aweme.effectplatform.C46436u;
import com.p2082ss.android.ugc.effectmanager.EffectManager;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.d */
public final class C46407d {

    /* renamed from: a */
    boolean f108141a;

    /* renamed from: b */
    public EffectManager f108142b;

    /* renamed from: c */
    public Map<String, Object> f108143c;

    static {
        Covode.recordClassIndex(54988);
    }

    /* renamed from: a */
    static ExceptionResult m89555a() {
        ExceptionResult exceptionResult = new ExceptionResult(new RuntimeException());
        exceptionResult.setErrorCode(-1);
        exceptionResult.setMsg("effect sdk manager init failed");
        return exceptionResult;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ICheckChannelListener mo78932a(ICheckChannelListener iCheckChannelListener) {
        return new AbstractC46431q(iCheckChannelListener) {
            /* class com.p2082ss.android.ugc.aweme.effectplatform.C46407d.C464123 */

            static {
                Covode.recordClassIndex(54993);
            }
        };
    }

    /* renamed from: a */
    public final void mo78933a(String str, ICheckChannelListener iCheckChannelListener) {
        if (!this.f108141a) {
            iCheckChannelListener.checkChannelFailed(m89555a());
        } else {
            this.f108142b.checkPanelIsUpdate(str, null, mo78932a(iCheckChannelListener));
        }
    }

    /* renamed from: a */
    public final void mo78934a(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        if (!this.f108141a) {
            iFetchEffectChannelListener.onFail(m89555a());
        } else {
            this.f108142b.fetchEffectListFromCache(str, iFetchEffectChannelListener);
        }
    }

    /* renamed from: a */
    public final void mo78936a(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
        C46434s a = C46434s.m89596a(str, iFetchEffectChannelListener);
        a.f108197a = this.f108143c;
        if (!this.f108141a) {
            a.onFail(m89555a());
        } else {
            this.f108142b.fetchEffectList(str, z, a);
        }
    }

    /* renamed from: b */
    public final void mo78938b(String str, boolean z, String str2, int i, int i2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        IFetchPanelInfoListener iFetchPanelInfoListener2 = iFetchPanelInfoListener;
        if (!this.f108141a) {
            iFetchPanelInfoListener2.onFail(m89555a());
            return;
        }
        if (!(iFetchPanelInfoListener2 instanceof C46436u)) {
            iFetchPanelInfoListener2 = C46436u.C46437a.m89603a(str, iFetchPanelInfoListener2);
        }
        ((C46436u) iFetchPanelInfoListener2).f108205a = this.f108143c;
        this.f108142b.fetchPanelInfo(str, z, str2, i, i2, iFetchPanelInfoListener2);
    }

    /* renamed from: a */
    public final void mo78937a(String str, boolean z, String str2, int i, int i2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        IFetchPanelInfoListener iFetchPanelInfoListener2 = iFetchPanelInfoListener;
        if (!this.f108141a) {
            iFetchPanelInfoListener2.onFail(m89555a());
            return;
        }
        if (!(iFetchPanelInfoListener2 instanceof C46436u)) {
            iFetchPanelInfoListener2 = C46436u.C46437a.m89603a(str, iFetchPanelInfoListener2);
        }
        ((C46436u) iFetchPanelInfoListener2).f108205a = this.f108143c;
        this.f108142b.fetchPanelInfoFromCache(str, z, str2, i, i2, iFetchPanelInfoListener2);
    }

    /* renamed from: a */
    public final void mo78935a(final String str, final String str2, final int i, final int i2, final int i3, final String str3, boolean z, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        final IFetchCategoryEffectListener iFetchCategoryEffectListener2 = iFetchCategoryEffectListener;
        if (!this.f108141a) {
            iFetchCategoryEffectListener2.onFail(m89555a());
            return;
        }
        if (!(iFetchCategoryEffectListener2 instanceof C46432r)) {
            iFetchCategoryEffectListener2 = C46432r.C46433a.m89595a(str, i, i2, iFetchCategoryEffectListener2);
        }
        ((C46432r) iFetchCategoryEffectListener2).f108191a = this.f108143c;
        if (z) {
            this.f108142b.fetchCategoryEffectFromCache(str, str2, i, i2, i3, str3, new IFetchCategoryEffectListener() {
                /* class com.p2082ss.android.ugc.aweme.effectplatform.C46407d.C464134 */

                static {
                    Covode.recordClassIndex(54994);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* bridge */ /* synthetic */ void onSuccess(CategoryPageModel categoryPageModel) {
                    iFetchCategoryEffectListener2.onSuccess(categoryPageModel);
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                    C46407d.this.f108142b.fetchCategoryEffect(str, str2, i, i2, i3, str3, iFetchCategoryEffectListener2);
                }
            });
        } else {
            this.f108142b.fetchCategoryEffect(str, str2, i, i2, i3, str3, iFetchCategoryEffectListener2);
        }
    }
}
