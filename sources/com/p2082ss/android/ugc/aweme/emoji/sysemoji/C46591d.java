package com.p2082ss.android.ugc.aweme.emoji.sysemoji;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.emojiPageV2.SwipeControlledRecycleView;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46613p;
import com.p2082ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.d */
public final class C46591d implements RecyclerView.AbstractC1370m {

    /* renamed from: a */
    public long f108627a;

    /* renamed from: b */
    private final int f108628b = 150;

    /* renamed from: c */
    private int f108629c = -1;

    /* renamed from: d */
    private float f108630d = -1.0f;

    /* renamed from: e */
    private float f108631e = -1.0f;

    /* renamed from: f */
    private final float f108632f;

    /* renamed from: g */
    private boolean f108633g;

    /* renamed from: h */
    private final C46588c f108634h;

    /* renamed from: i */
    private final SwipeControlledViewPager f108635i;

    /* renamed from: j */
    private final List<C46447a> f108636j;

    static {
        Covode.recordClassIndex(55181);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
    /* renamed from: a */
    public final void mo4750a(boolean z) {
    }

    /* renamed from: a */
    private final void m89920a(SwipeControlledViewPager swipeControlledViewPager) {
        if (m89919a((View) swipeControlledViewPager) != null) {
            swipeControlledViewPager.setSwipeEnabled(true);
            this.f108629c = -1;
        }
    }

    /* renamed from: a */
    private static Activity m89919a(View view) {
        Context context = view.getContext();
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
    /* renamed from: b */
    public final void mo4752b(RecyclerView recyclerView, MotionEvent motionEvent) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(motionEvent, "");
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 2) {
                if (action == 3 && this.f108634h.isShowing()) {
                    m89920a(this.f108635i);
                    this.f108634h.dismiss();
                }
            } else if (this.f108634h.isShowing()) {
                C46588c cVar = this.f108634h;
                C46534a aVar = this.f108636j.get(this.f108629c).f108224d;
                Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel");
                cVar.mo79184a((C46605i) aVar, motionEvent);
            }
        } else if (this.f108634h.isShowing()) {
            C46588c cVar2 = this.f108634h;
            C46534a aVar2 = this.f108636j.get(this.f108629c).f108224d;
            Objects.requireNonNull(aVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel");
            cVar2.mo79184a((C46605i) aVar2, motionEvent);
            m89920a(this.f108635i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
    /* renamed from: a */
    public final boolean mo4751a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View a;
        int absoluteAdapterPosition;
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(motionEvent, "");
        if (!(recyclerView instanceof SwipeControlledRecycleView) || (a = recyclerView.mo4391a(motionEvent.getX(), motionEvent.getY())) == null) {
            return false;
        }
        C89219l.m154716b(a, "");
        RecyclerView.ViewHolder a2 = recyclerView.mo4393a(a);
        if (!(a2 instanceof C46613p.C46614a) || (absoluteAdapterPosition = a2.getAbsoluteAdapterPosition()) == -1) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f108630d = motionEvent.getRawX();
            this.f108631e = motionEvent.getRawY();
            this.f108627a = System.currentTimeMillis();
            this.f108629c = absoluteAdapterPosition;
            this.f108633g = false;
        } else if (action == 1) {
            m89920a(this.f108635i);
        } else if (action == 2) {
            if (Math.abs(motionEvent.getRawX() - this.f108630d) > this.f108632f || Math.abs(motionEvent.getRawY() - this.f108631e) > this.f108632f) {
                this.f108633g = true;
            }
            if (this.f108633g) {
                return false;
            }
            int i = this.f108629c;
            if (i != absoluteAdapterPosition) {
                this.f108629c = -1;
                return false;
            } else if (i != -1 && this.f108627a != 0 && System.currentTimeMillis() - this.f108627a > ((long) this.f108628b) && !this.f108634h.isShowing() && this.f108629c == absoluteAdapterPosition) {
                a.performHapticFeedback(0);
                C46588c cVar = this.f108634h;
                C46534a aVar = this.f108636j.get(absoluteAdapterPosition).f108224d;
                Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel");
                cVar.mo79184a((C46605i) aVar, motionEvent);
                C46588c cVar2 = this.f108634h;
                cVar2.getContentView().measure(C46588c.m89915a(cVar2.getWidth()), C46588c.m89915a(cVar2.getHeight()));
                C46588c cVar3 = this.f108634h;
                C89219l.m154721d(a, "");
                Rect rect = new Rect();
                a.getGlobalVisibleRect(rect);
                C56244a.m102190b("EmojiPopUpWindow", "anchor  ".concat(String.valueOf(rect)));
                C56244a.m102190b("EmojiPopUpWindow", "contentRect  ".concat(String.valueOf(new Rect())));
                Rect rect2 = new Rect();
                Window window = cVar3.f108621b.getWindow();
                C89219l.m154716b(window, "");
                window.getDecorView().getGlobalVisibleRect(rect2);
                C56244a.m102190b("EmojiPopUpWindow", "decorView  ".concat(String.valueOf(rect2)));
                C56244a.m102190b("EmojiPopUpWindow", "contentView.measuredWidth  " + cVar3.mo79183a());
                int i2 = (-(cVar3.mo79183a() - a.getMeasuredWidth())) / 2;
                int i3 = -a.getMeasuredHeight();
                View contentView = cVar3.getContentView();
                C89219l.m154716b(contentView, "");
                int measuredHeight = i3 - contentView.getMeasuredHeight();
                C56244a.m102190b("EmojiPopUpWindow", "showAsDropDown   " + i2 + "  " + measuredHeight);
                cVar3.showAsDropDown(a, i2, measuredHeight - 12);
                this.f108635i.setSwipeEnabled(false);
                return true;
            }
        } else if (action == 3 && this.f108634h.isShowing()) {
            m89920a(this.f108635i);
            this.f108634h.dismiss();
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.emoji.b.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public C46591d(C46588c cVar, SwipeControlledViewPager swipeControlledViewPager, List<? extends C46447a> list, int i) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(swipeControlledViewPager, "");
        C89219l.m154721d(list, "");
        this.f108634h = cVar;
        this.f108635i = swipeControlledViewPager;
        this.f108636j = list;
        this.f108632f = ((float) i) / 2.0f;
    }
}
