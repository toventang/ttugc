package com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49678f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50434a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50453c;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50457d;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50458e;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50459f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50462h;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.VideoSeekBar;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2976c.C50454a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2976c.C50456b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.a.g */
public final class C50447g extends C50437b {
    static {
        Covode.recordClassIndex(59583);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i, com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.C50437b
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(60, new RunnableC90250g(C50447g.class, "onDislikeAwemeEvent", C49678f.class, ThreadMode.POSTING, 0, false));
        subscriberEventTypes.put(159, new RunnableC90250g(C50447g.class, "onFullFeedFragmentLifeCycleEvent", C50454a.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.C50437b, com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.AbstractC50448h
    /* renamed from: b */
    public final void mo85690b(boolean z) {
        mo85687a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.C50437b, com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.VideoSeekBar.AbstractC50431c
    /* renamed from: b */
    public final void mo85659b(SeekBar seekBar) {
        super.mo85659b(seekBar);
        C51423a.m95784a(3, C50437b.f116483w, "onStopTrackingTouch");
        AbstractC81915c.m141874a(new C50456b(false, this.f116486a));
        this.f116491f = false;
    }

    @AbstractC90264r
    public final void onDislikeAwemeEvent(C49678f fVar) {
        C89219l.m154721d(fVar, "");
        if (fVar.f114342b == 1 && fVar.f114341a) {
            mo85687a(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.C50437b, com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.VideoSeekBar.AbstractC50430b
    /* renamed from: a */
    public final void mo85656a(MotionEvent motionEvent) {
        Integer valueOf;
        super.mo85656a(motionEvent);
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null && valueOf.intValue() == 2 && this.f116490e && !this.f116491f) {
            C51423a.m95784a(3, C50437b.f116483w, "dispatchTouchEvent#move ");
            AbstractC81915c.m141874a(new C50456b(true, this.f116486a));
            this.f116491f = true;
        }
    }

    @AbstractC90264r
    public final void onFullFeedFragmentLifeCycleEvent(C50454a aVar) {
        C89219l.m154721d(aVar, "");
        if ((!C89219l.m154714a(this.f116486a, aVar.f116529b)) && (!C89219l.m154714a(this.f116494i, aVar.f116530c))) {
            C51423a.m95784a(3, C50437b.f116483w, "onFullFeedFragmentLifeCycleEvent");
            AbstractC81915c.m141874a(new C50456b(false, this.f116486a));
        }
        this.f116486a = aVar.f116529b;
        this.f116494i = aVar.f116530c;
        int i = aVar.f116528a;
        if (i == 1) {
            mo85685a();
        } else if (i == 2) {
            this.f116503r.setVisibility(8);
            this.f116504s.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.C50437b
    /* renamed from: a */
    public final boolean mo85688a(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        C89219l.m154721d(obj, "");
        Object obj7 = null;
        if (!(obj instanceof C50457d)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        if (C89219l.m154714a(obj, obj2)) {
            return C50443c.m94609a(((C50457d) obj).f116535b);
        }
        if (!(obj instanceof C50434a)) {
            obj3 = null;
        } else {
            obj3 = obj;
        }
        if (C89219l.m154714a(obj, obj3)) {
            return C50443c.m94609a(((C50434a) obj).f116476b);
        }
        if (!(obj instanceof C50459f)) {
            obj4 = null;
        } else {
            obj4 = obj;
        }
        if (C89219l.m154714a(obj, obj4)) {
            return C50443c.m94609a(((C50459f) obj).f116546b);
        }
        if (!(obj instanceof C50462h)) {
            obj5 = null;
        } else {
            obj5 = obj;
        }
        if (C89219l.m154714a(obj, obj5)) {
            return C50443c.m94609a(((C50462h) obj).f116555c);
        }
        if (!(obj instanceof C50458e)) {
            obj6 = null;
        } else {
            obj6 = obj;
        }
        if (C89219l.m154714a(obj, obj6)) {
            return C50443c.m94609a(((C50458e) obj).f116540b);
        }
        if (obj instanceof C50453c) {
            obj7 = obj;
        }
        if (C89219l.m154714a(obj, obj7)) {
            return C50443c.m94609a(((C50453c) obj).f116526c);
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50447g(VideoSeekBar videoSeekBar, ViewGroup viewGroup, TextView textView, TextView textView2, ScrollSwitchStateManager scrollSwitchStateManager) {
        super(videoSeekBar, viewGroup, textView, textView2, scrollSwitchStateManager);
        C89219l.m154721d(videoSeekBar, "");
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(textView, "");
        C89219l.m154721d(textView2, "");
        C89219l.m154721d(scrollSwitchStateManager, "");
        C50446f.m94620a(videoSeekBar, viewGroup);
    }
}
