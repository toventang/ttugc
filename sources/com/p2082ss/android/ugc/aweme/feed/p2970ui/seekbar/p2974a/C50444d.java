package com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50434a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50449b;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50453c;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50457d;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50458e;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50459f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50462h;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.VideoSeekBar;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.a.d */
public final class C50444d extends C50437b {
    static {
        Covode.recordClassIndex(59580);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.C50437b, com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.AbstractC50448h
    /* renamed from: c */
    public final void mo85691c() {
        this.f116504s.setVisibility(8);
        this.f116503r.setSeekBarShowType(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.C50437b, com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.VideoSeekBar.AbstractC50431c
    /* renamed from: b */
    public final void mo85659b(SeekBar seekBar) {
        super.mo85659b(seekBar);
        AbstractC81915c.m141874a(new C50449b(false, this.f116486a, this.f116494i));
        this.f116491f = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.p2974a.C50437b, com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.VideoSeekBar.AbstractC50430b
    /* renamed from: a */
    public final void mo85656a(MotionEvent motionEvent) {
        Integer valueOf;
        super.mo85656a(motionEvent);
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null && valueOf.intValue() == 2 && this.f116490e && !this.f116491f) {
            AbstractC81915c.m141874a(new C50449b(true, this.f116486a, this.f116494i));
            this.f116491f = true;
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
            return C89219l.m154714a(((C50457d) obj).f116538e, this.f116494i);
        }
        if (!(obj instanceof C50434a)) {
            obj3 = null;
        } else {
            obj3 = obj;
        }
        if (!C89219l.m154714a(obj, obj3)) {
            if (!(obj instanceof C50459f)) {
                obj4 = null;
            } else {
                obj4 = obj;
            }
            if (C89219l.m154714a(obj, obj4)) {
                return C89219l.m154714a(((C50459f) obj).f116549e, this.f116494i);
            }
            if (!(obj instanceof C50462h)) {
                obj5 = null;
            } else {
                obj5 = obj;
            }
            if (C89219l.m154714a(obj, obj5)) {
                return true;
            }
            if (!(obj instanceof C50458e)) {
                obj6 = null;
            } else {
                obj6 = obj;
            }
            if (C89219l.m154714a(obj, obj6)) {
                return C89219l.m154714a(((C50458e) obj).f116543e, this.f116494i);
            }
            if (obj instanceof C50453c) {
                obj7 = obj;
            }
            if (C89219l.m154714a(obj, obj7)) {
                return true;
            }
            return false;
        } else if (C89219l.m154714a(((C50434a) obj).f116478d, this.f116494i)) {
            return true;
        } else {
            this.f116503r.setVisibility(8);
            this.f116504s.setVisibility(8);
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50444d(VideoSeekBar videoSeekBar, ViewGroup viewGroup, TextView textView, TextView textView2, ScrollSwitchStateManager scrollSwitchStateManager, AbstractC49849am amVar) {
        super(videoSeekBar, viewGroup, textView, textView2, scrollSwitchStateManager);
        C89219l.m154721d(videoSeekBar, "");
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(textView, "");
        C89219l.m154721d(textView2, "");
        C89219l.m154721d(amVar, "");
        this.f116494i = amVar;
        C50446f.m94620a(videoSeekBar, viewGroup);
    }
}
