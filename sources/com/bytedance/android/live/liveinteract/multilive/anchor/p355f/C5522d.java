package com.bytedance.android.live.liveinteract.multilive.anchor.p355f;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.C4404ar;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4430d;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.f.d */
public final class C5522d extends AbstractC5527g {
    @AbstractC4430d(mo10204a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: a */
    public C5271a f14104a;

    static {
        Covode.recordClassIndex(6117);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public final int mo11259a() {
        return R.layout.bc9;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: d */
    public final boolean mo11263d() {
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: c */
    public final EnumC4422k mo11262c() {
        return EnumC4422k.GRID;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a
    /* renamed from: e */
    public final FrameLayout mo11309e() {
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup == null || m12156c(viewGroup).size() != 0) {
            return super.mo11309e();
        }
        ViewGroup viewGroup2 = this.f14257d;
        if (viewGroup2 != null) {
            return (FrameLayout) viewGroup2.findViewById(R.id.d3b);
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5522d(DataChannel dataChannel) {
        super(dataChannel);
        C89219l.m154721d(dataChannel, "");
        C4431e.f12034a.mo10201a(this);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.p355f.AbstractC5527g, com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a, com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public final void mo11256a(ViewGroup viewGroup) {
        View findViewById;
        View findViewById2;
        C89219l.m154721d(viewGroup, "");
        super.mo11256a(viewGroup);
        ViewGroup viewGroup2 = this.f14257d;
        if (!(viewGroup2 == null || (findViewById2 = viewGroup2.findViewById(R.id.el3)) == null)) {
            findViewById2.setVisibility(8);
        }
        ViewGroup viewGroup3 = this.f14257d;
        if (viewGroup3 != null && (findViewById = viewGroup3.findViewById(R.id.wo)) != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a, com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public final void mo11274a(View view) {
        MethodCollector.m26663i(7448);
        C89219l.m154721d(view, "");
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup == null) {
            MethodCollector.m26664o(7448);
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (C89219l.m154714a(parent, viewGroup.findViewById(R.id.d38))) {
                ((FrameLayout) viewGroup.findViewById(R.id.d38)).removeView(view);
            } else if (C89219l.m154714a(parent, viewGroup.findViewById(R.id.d39))) {
                ((FrameLayout) viewGroup.findViewById(R.id.d39)).removeView(view);
            } else if (C89219l.m154714a(parent, viewGroup.findViewById(R.id.d3_))) {
                ((FrameLayout) viewGroup.findViewById(R.id.d3_)).removeView(view);
            }
        }
        ViewGroup viewGroup2 = this.f14257d;
        if (viewGroup2 != null) {
            ArrayList<View> c = m12156c(viewGroup2);
            int size = c.size();
            if (size == 0) {
                FrameLayout frameLayout = (FrameLayout) viewGroup2.findViewById(R.id.d38);
                C89219l.m154716b(frameLayout, "");
                frameLayout.setVisibility(8);
                FrameLayout frameLayout2 = (FrameLayout) viewGroup2.findViewById(R.id.d39);
                C89219l.m154716b(frameLayout2, "");
                frameLayout2.setVisibility(8);
                FrameLayout frameLayout3 = (FrameLayout) viewGroup2.findViewById(R.id.d3_);
                C89219l.m154716b(frameLayout3, "");
                frameLayout3.setVisibility(8);
                View findViewById = viewGroup2.findViewById(R.id.el3);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                View findViewById2 = viewGroup2.findViewById(R.id.wo);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
                View findViewById3 = viewGroup2.findViewById(R.id.cyj);
                if (findViewById3 != null) {
                    findViewById3.setVisibility(8);
                }
                View findViewById4 = viewGroup2.findViewById(R.id.cyk);
                if (findViewById4 != null) {
                    findViewById4.setVisibility(8);
                }
                View findViewById5 = viewGroup2.findViewById(R.id.cyg);
                if (findViewById5 != null) {
                    findViewById5.setVisibility(8);
                }
            } else if (size == 1) {
                FrameLayout frameLayout4 = (FrameLayout) viewGroup2.findViewById(R.id.d38);
                C89219l.m154716b(frameLayout4, "");
                frameLayout4.setVisibility(8);
                FrameLayout frameLayout5 = (FrameLayout) viewGroup2.findViewById(R.id.d3_);
                C89219l.m154716b(frameLayout5, "");
                frameLayout5.setVisibility(8);
                FrameLayout frameLayout6 = (FrameLayout) viewGroup2.findViewById(R.id.d39);
                C89219l.m154716b(frameLayout6, "");
                frameLayout6.setVisibility(0);
                View view2 = c.get(0);
                C89219l.m154716b(view2, "");
                m12155a(view2, (FrameLayout) viewGroup2.findViewById(R.id.d39));
                View findViewById6 = viewGroup2.findViewById(R.id.cyj);
                if (findViewById6 != null) {
                    findViewById6.setVisibility(8);
                }
                View findViewById7 = viewGroup2.findViewById(R.id.cyk);
                if (findViewById7 != null) {
                    findViewById7.setVisibility(8);
                }
                View findViewById8 = viewGroup2.findViewById(R.id.cyg);
                if (findViewById8 != null) {
                    findViewById8.setVisibility(0);
                }
            } else if (size == 2) {
                FrameLayout frameLayout7 = (FrameLayout) viewGroup2.findViewById(R.id.d38);
                C89219l.m154716b(frameLayout7, "");
                frameLayout7.setVisibility(8);
                FrameLayout frameLayout8 = (FrameLayout) viewGroup2.findViewById(R.id.d39);
                C89219l.m154716b(frameLayout8, "");
                frameLayout8.setVisibility(0);
                FrameLayout frameLayout9 = (FrameLayout) viewGroup2.findViewById(R.id.d3_);
                if (frameLayout9 != null) {
                    frameLayout9.setVisibility(0);
                }
                View view3 = c.get(0);
                C89219l.m154716b(view3, "");
                m12155a(view3, (FrameLayout) viewGroup2.findViewById(R.id.d39));
                View view4 = c.get(1);
                C89219l.m154716b(view4, "");
                m12155a(view4, (FrameLayout) viewGroup2.findViewById(R.id.d3_));
                View findViewById9 = viewGroup2.findViewById(R.id.cyj);
                if (findViewById9 != null) {
                    findViewById9.setVisibility(8);
                }
                View findViewById10 = viewGroup2.findViewById(R.id.cyk);
                if (findViewById10 != null) {
                    findViewById10.setVisibility(0);
                }
                View findViewById11 = viewGroup2.findViewById(R.id.cyg);
                if (findViewById11 != null) {
                    findViewById11.setVisibility(0);
                }
            }
            mo11395m();
        }
        C5271a aVar = this.f14104a;
        if (aVar == null) {
            C89219l.m154710a("mMultiGuestDataHolder");
        }
        if (aVar.f13641l == 0) {
            C5271a aVar2 = this.f14104a;
            if (aVar2 == null) {
                C89219l.m154710a("mMultiGuestDataHolder");
            }
            aVar2.mo11109a(EnumC4422k.NORMAL);
        }
        this.f14261h.mo28320c(C4404ar.class, Integer.valueOf(m12156c(viewGroup).size() + 1));
        MethodCollector.m26664o(7448);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5612a, com.bytedance.android.live.liveinteract.multilive.p362e.AbstractC5622b
    /* renamed from: a */
    public final int mo11260a(View view, int i) {
        int a;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        View childAt;
        View childAt2;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        FrameLayout frameLayout5;
        MethodCollector.m26663i(7444);
        C89219l.m154721d(view, "");
        ViewGroup viewGroup = this.f14257d;
        if (viewGroup == null) {
            MethodCollector.m26664o(7444);
            return -1;
        }
        View findViewById = viewGroup.findViewById(R.id.el3);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        View findViewById2 = viewGroup.findViewById(R.id.wo);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
        FrameLayout frameLayout6 = (FrameLayout) viewGroup.findViewById(R.id.d38);
        if (frameLayout6 == null || frameLayout6.getChildCount() != 0 || (frameLayout5 = (FrameLayout) viewGroup.findViewById(R.id.d39)) == null || frameLayout5.getChildCount() != 0) {
            FrameLayout frameLayout7 = (FrameLayout) viewGroup.findViewById(R.id.d38);
            if (frameLayout7 == null || frameLayout7.getChildCount() != 0 || (frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.d39)) == null || frameLayout3.getChildCount() <= 0 || !((frameLayout4 = (FrameLayout) viewGroup.findViewById(R.id.d3_)) == null || frameLayout4.getChildCount() == 0)) {
                FrameLayout frameLayout8 = (FrameLayout) viewGroup.findViewById(R.id.d38);
                if (frameLayout8 == null || frameLayout8.getChildCount() != 0 || (frameLayout = (FrameLayout) viewGroup.findViewById(R.id.d39)) == null || frameLayout.getChildCount() <= 0 || (frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.d3_)) == null || frameLayout2.getChildCount() <= 0) {
                    a = super.mo11260a(view, i);
                } else {
                    FrameLayout frameLayout9 = (FrameLayout) viewGroup.findViewById(R.id.d39);
                    if (!(frameLayout9 == null || (childAt2 = frameLayout9.getChildAt(0)) == null)) {
                        m12155a(childAt2, (FrameLayout) viewGroup.findViewById(R.id.d38));
                    }
                    FrameLayout frameLayout10 = (FrameLayout) viewGroup.findViewById(R.id.d3_);
                    if (!(frameLayout10 == null || (childAt = frameLayout10.getChildAt(0)) == null)) {
                        m12155a(childAt, (FrameLayout) viewGroup.findViewById(R.id.d39));
                    }
                    FrameLayout frameLayout11 = (FrameLayout) viewGroup.findViewById(R.id.d3_);
                    if (frameLayout11 != null) {
                        frameLayout11.setVisibility(0);
                    }
                    FrameLayout frameLayout12 = (FrameLayout) viewGroup.findViewById(R.id.d3_);
                    if (frameLayout12 != null) {
                        frameLayout12.addView(view, m12159n());
                    }
                    View findViewById3 = viewGroup.findViewById(R.id.cyj);
                    if (findViewById3 != null) {
                        findViewById3.setVisibility(0);
                    }
                    a = 3;
                }
            } else {
                FrameLayout frameLayout13 = (FrameLayout) viewGroup.findViewById(R.id.d38);
                C89219l.m154716b(frameLayout13, "");
                frameLayout13.setVisibility(8);
                FrameLayout frameLayout14 = (FrameLayout) viewGroup.findViewById(R.id.d39);
                C89219l.m154716b(frameLayout14, "");
                frameLayout14.setVisibility(0);
                FrameLayout frameLayout15 = (FrameLayout) viewGroup.findViewById(R.id.d3_);
                if (frameLayout15 != null) {
                    frameLayout15.setVisibility(0);
                }
                FrameLayout frameLayout16 = (FrameLayout) viewGroup.findViewById(R.id.d3_);
                if (frameLayout16 != null) {
                    frameLayout16.addView(view, m12159n());
                }
                View findViewById4 = viewGroup.findViewById(R.id.cyk);
                if (findViewById4 != null) {
                    findViewById4.setVisibility(0);
                }
                a = 2;
            }
        } else {
            FrameLayout frameLayout17 = (FrameLayout) viewGroup.findViewById(R.id.d38);
            C89219l.m154716b(frameLayout17, "");
            frameLayout17.setVisibility(8);
            FrameLayout frameLayout18 = (FrameLayout) viewGroup.findViewById(R.id.d3_);
            C89219l.m154716b(frameLayout18, "");
            frameLayout18.setVisibility(8);
            FrameLayout frameLayout19 = (FrameLayout) viewGroup.findViewById(R.id.d39);
            C89219l.m154716b(frameLayout19, "");
            frameLayout19.setVisibility(0);
            ((FrameLayout) viewGroup.findViewById(R.id.d39)).addView(view, m12159n());
            View findViewById5 = viewGroup.findViewById(R.id.cyg);
            if (findViewById5 != null) {
                findViewById5.setVisibility(0);
            }
            a = 1;
        }
        this.f14261h.mo28320c(C4404ar.class, Integer.valueOf(m12156c(viewGroup).size() + 1));
        MethodCollector.m26664o(7444);
        return a;
    }
}
