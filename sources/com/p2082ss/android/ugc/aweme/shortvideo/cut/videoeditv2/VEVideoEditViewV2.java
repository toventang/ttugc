package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import androidx.core.content.C0643b;
import androidx.core.p036g.C0692e;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70095p;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.C70089d;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEVideoEditViewV2 */
public class VEVideoEditViewV2 extends AbstractView$OnTouchListenerC70571l {

    /* renamed from: N */
    private long f157803N;

    /* renamed from: O */
    private long f157804O;

    /* renamed from: P */
    private boolean f157805P;

    /* renamed from: Q */
    private Map<String, Boolean> f157806Q;

    static {
        Covode.recordClassIndex(83019);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: f */
    public final void mo111109f() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: g */
    public final boolean mo111148g() {
        return false;
    }

    public void setCanEdit(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public int getEditState() {
        return this.f157898u;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public long getLeftSeekingValue() {
        return this.f157841A;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public long getMultiSeekTime() {
        return this.f157841A;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public long getRightSeekingValue() {
        return this.f157842B;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public long getSingleSeekTime() {
        return this.f157841A;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: a */
    public final void mo111104a(List<VideoSegment> list) {
        this.f157898u = 1;
        this.f157891n.mo111224c(list);
        this.f157888k = C70637di.m124840a();
        this.f157903z = C70558b.m124608a(this.f157891n.mo111232k(), this.f157891n.mo111233l());
        this.f157843C = mo111318b(Math.min(this.f157903z, C70095p.m123775a()));
        this.f157894q.f157809b = this.f157843C;
        C70558b bVar = this.f157894q;
        long j = this.f157903z;
        this.f157891n.mo111233l();
        bVar.mo111305b(j);
        this.f157841A = 0;
        this.f157842B = this.f157841A + this.f157843C;
        this.f157884g.setVisibility(8);
        this.f157883f.setVisibility(0);
        this.f157883f.mo4413b(0);
        C70560c cVar = this.f157895r;
        float f = this.f157894q.f157808a;
        C89219l.m154721d(list, "");
        if (!C13617h.m24465a(list)) {
            cVar.f157815c.addAll(list);
            cVar.mo111312b(f, 0.0f);
        }
        this.f157891n.mo111207a(0.0f);
        if (this.f157850J.booleanValue()) {
            this.f157804O = 0;
            this.f157803N = 0;
        }
        mo111325n();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: a */
    public final void mo111132a(C0692e<Float, Float> eVar, List<VideoSegment> list) {
        if (list != null) {
            this.f157891n.mo111220b(list);
        }
        if (!this.f157850J.booleanValue()) {
            long j = 0;
            this.f157804O = (eVar == null || eVar.f2750a == null) ? 0 : eVar.f2750a.longValue();
            if (!(eVar == null || eVar.f2751b == null)) {
                j = eVar.f2751b.longValue();
            }
            this.f157803N = j;
        }
        mo111108e();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: a */
    public final void mo111105a(boolean z) {
        if (this.f157850J.booleanValue() != z) {
            if (!this.f157850J.booleanValue()) {
                this.f157803N = this.f157843C;
                this.f157804O = this.f157841A;
                if (getRecyclerView().f157764O) {
                    mo111326o();
                }
            }
            this.f157850J = Boolean.valueOf(z);
            if (z) {
                m124587r();
            } else {
                m124588s();
            }
            setFocusOnMode(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: a */
    public final void mo111133a(C0692e<Float, Float> eVar, boolean z) {
        if (!z && eVar.f2750a != null && eVar.f2751b != null && !C13617h.m24465a(this.f157891n.mo111232k())) {
            this.f157898u = 2;
            VideoSegment videoSegment = this.f157891n.mo111232k().get(0);
            if (this.f157900w == null) {
                this.f157900w = new C70089d(videoSegment);
            } else {
                this.f157900w.mo110594a(videoSegment);
            }
            this.f157841A = (long) (eVar.f2750a.floatValue() / videoSegment.mo110582f());
            this.f157842B = (long) (eVar.f2751b.floatValue() / videoSegment.mo110582f());
            this.f157903z = (long) (((float) videoSegment.f156710b) / videoSegment.mo110582f());
            this.f157843C = this.f157842B - this.f157841A;
            this.f157894q.f157809b = this.f157843C;
            this.f157894q.mo111304a(videoSegment.f156710b, videoSegment.mo110582f());
            mo111142b();
            this.f157883f.setVisibility(8);
            this.f157884g.setVisibility(0);
            this.f157884g.mo4413b(0);
            this.f157896s.mo111307a(this.f157894q.f157808a, videoSegment);
            mo111323l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo111294a(VideoSegment videoSegment) {
        m124584a(videoSegment, false);
        this.f157898u = 1;
        this.f157891n.mo111208a(1);
        this.f157891n.mo111219b(videoSegment.mo110571a(true));
        this.f157888k = C70637di.m124840a();
        this.f157903z = C70558b.m124608a(this.f157891n.mo111232k(), this.f157891n.mo111233l());
        this.f157843C = mo111318b(Math.min(this.f157903z, C70095p.m123775a()));
        this.f157894q.f157809b = this.f157843C;
        C70558b bVar = this.f157894q;
        long j = this.f157903z;
        this.f157891n.mo111233l();
        bVar.mo111305b(j);
        m124586q();
        mo111316a(0, this.f157843C, this.f157903z);
        this.f157883f.mo4413b(0);
        C70560c cVar = this.f157895r;
        float f = this.f157894q.f157808a;
        C89219l.m154721d(videoSegment, "");
        if (!C13617h.m24465a(cVar.f157815c)) {
            cVar.f157815c.remove(videoSegment);
            cVar.mo111312b(f, 0.0f);
        }
        this.f157891n.mo111212a(videoSegment);
        if (this.f157900w != null) {
            this.f157900w.mo110593a();
        }
        mo111325n();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: d */
    public final boolean mo111107d() {
        return this.f157850J.booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public long getMultiPlayingPosition() {
        return getPlayingPosition();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public long getSinglePlayingPosition() {
        return getPlayingPosition();
    }

    private Map<String, Boolean> getSingleEditFirstMap() {
        if (this.f157806Q == null) {
            this.f157806Q = new HashMap(8);
        }
        return this.f157806Q;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public int getCurrentRotate() {
        if (this.f157898u == 2 || this.f157898u == 0) {
            return this.f157900w.f156749c;
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public C0692e<Long, Long> getPlayBoundary() {
        if (this.f157898u == 1) {
            return getMultiVideoPlayDur();
        }
        return getSingleVideoPlayDur();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public float getCurrentSpeed() {
        if (this.f157898u == 2 || this.f157898u == 0) {
            return this.f157900w.f156750d;
        }
        return this.f157891n.mo111233l();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public long getMaxCutDuration() {
        if (this.f157898u == 1) {
            return m124585c(this.f157889l);
        }
        return (long) (((float) this.f157889l) * this.f157900w.f156750d);
    }

    public C0692e<Long, Long> getMultiVideoPlayDur() {
        return C0692e.m2449a(Long.valueOf(m124585c(this.f157841A)), Long.valueOf(m124585c(this.f157842B)));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public long getPlayingPosition() {
        return (long) ((((this.f157882e.getStartX() - this.f157881d.getStartX()) - ((float) C70563d.f157831c)) * this.f157894q.f157808a) + ((float) this.f157841A));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public float getSelectedTime() {
        long j = this.f157843C;
        if (this.f157843C > this.f157889l) {
            j = this.f157889l;
        }
        return ((float) j) / 1000.0f;
    }

    public C0692e<Long, Long> getSingleVideoPlayDur() {
        return C0692e.m2449a(Long.valueOf((long) (((float) this.f157841A) * this.f157900w.f156750d)), Long.valueOf((long) (((float) this.f157842B) * this.f157900w.f156750d)));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public C0692e<Float, Float> getSlideX() {
        return new C0692e<>(Float.valueOf(this.f157881d.getStartX()), Float.valueOf(this.f157880c.getStartX()));
    }

    /* renamed from: q */
    private void m124586q() {
        int i = 0;
        setEditViewHeight(false);
        this.f157884g.setVisibility(8);
        if (this.f157850J.booleanValue()) {
            AutoPollRecyclerView autoPollRecyclerView = this.f157883f;
            if (!this.f157805P) {
                i = 8;
            }
            autoPollRecyclerView.setVisibility(i);
            return;
        }
        this.f157883f.setVisibility(0);
    }

    /* renamed from: r */
    private void m124587r() {
        this.f157881d.setOnTouchListener(null);
        this.f157880c.setOnTouchListener(null);
        this.f157882e.setOnTouchListener(this);
        this.f157893p = false;
        this.f157881d.setImageDrawable(m124582a((Boolean) true));
        this.f157880c.setImageDrawable(m124582a((Boolean) false));
        mo111325n();
    }

    /* renamed from: s */
    private void m124588s() {
        this.f157881d.setImageResource(2131235015);
        this.f157880c.setImageResource(2131235014);
        this.f157881d.setOnTouchListener(this);
        this.f157881d.setTag("startSlide");
        this.f157880c.setOnTouchListener(this);
        this.f157880c.setTag("endSlide");
        this.f157882e.setOnTouchListener(this);
        this.f157882e.setTag("curPoint");
        this.f157893p = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo111300k() {
        if (this.f157900w != null) {
            this.f157900w.f156749c += 90;
            if (this.f157900w.f156749c >= 360) {
                this.f157900w.f156749c = 0;
            }
            if (this.f157898u == 0) {
                this.f157891n.mo111213a(this.f157900w, 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2.AbstractView$OnTouchListenerC70571l
    /* renamed from: h */
    public final void mo111297h() {
        super.mo111297h();
        this.f157892o.f156531c.observe(this.f157890m, new C70564e(this));
        this.f157892o.f156532d.observe(this.f157890m, new C70565f(this));
        this.f157892o.f156533e.observe(this.f157890m, new C70566g(this));
        this.f157892o.f156534f.observe(this.f157890m, new C70567h(this));
        this.f157892o.f156535g.observe(this.f157890m, new C70568i(this));
        this.f157892o.f156536h.observe(this.f157890m, new C70569j(this));
        this.f157892o.f156537i.observe(this.f157890m, new C70570k(this));
        this.f157804O = this.f157841A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo111299j() {
        this.f157898u = 1;
        this.f157891n.mo111208a(1);
        this.f157888k = C70637di.m124840a();
        this.f157903z = C70558b.m124608a(this.f157891n.mo111232k(), this.f157891n.mo111233l());
        mo111316a(this.f157844D, this.f157845E, this.f157903z);
        this.f157894q.f157809b = this.f157843C;
        C70558b bVar = this.f157894q;
        long j = this.f157903z;
        this.f157891n.mo111233l();
        bVar.mo111305b(j);
        m124586q();
        this.f157891n.mo111229h();
        if (this.f157900w != null) {
            this.f157900w.mo110593a();
        }
        mo111325n();
        this.f157852L.mo111281c();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: c */
    public final void mo111145c() {
        this.f157843C = mo111318b(Math.min(this.f157903z, C70095p.m123775a()));
        this.f157894q.f157809b = this.f157843C;
        this.f157841A = 0;
        this.f157842B = this.f157841A + this.f157843C;
        if (this.f157850J.booleanValue()) {
            this.f157804O = 0;
            this.f157803N = 0;
        }
        C70558b bVar = this.f157894q;
        long j = this.f157903z;
        this.f157891n.mo111233l();
        bVar.mo111305b(j);
        this.f157883f.mo4413b(0);
        this.f157891n.mo111207a(this.f157897t);
        ArrayList arrayList = new ArrayList();
        for (VideoSegment videoSegment : this.f157891n.mo111232k()) {
            if (!videoSegment.f156717i) {
                arrayList.add(videoSegment);
            }
        }
        this.f157895r.mo111310a(arrayList, this.f157894q.f157808a);
        mo111326o();
        mo111325n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo111298i() {
        m124584a(this.f157891n.mo111232k().get(this.f157899v), true);
        this.f157898u = 1;
        this.f157891n.mo111208a(1);
        this.f157900w.f156747a = (long) (((float) this.f157841A) * this.f157900w.f156750d);
        this.f157900w.f156748b = (long) (((float) this.f157842B) * this.f157900w.f156750d);
        this.f157891n.mo111213a(this.f157900w, this.f157899v);
        this.f157888k = C70637di.m124840a();
        this.f157903z = C70558b.m124608a(this.f157891n.mo111232k(), this.f157891n.mo111233l());
        this.f157843C = mo111318b(Math.min(this.f157903z, C70095p.m123775a()));
        this.f157894q.f157809b = this.f157843C;
        this.f157841A = 0;
        this.f157842B = this.f157843C;
        C70558b bVar = this.f157894q;
        long j = this.f157903z;
        this.f157891n.mo111233l();
        bVar.mo111305b(j);
        m124586q();
        this.f157883f.mo4413b(0);
        this.f157895r.mo111312b(this.f157894q.f157808a, 0.0f);
        this.f157891n.mo111230i();
        if (this.f157900w != null) {
            this.f157900w.mo110593a();
        }
        mo111325n();
        this.f157852L.mo111281c();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: a */
    public final void mo111127a() {
        if (this.f157891n != null) {
            if (this.f157898u == 0) {
                if (this.f157896s != null) {
                    this.f157896s.mo111309a(this.f157891n.mo111232k());
                }
            } else if (this.f157895r != null) {
                this.f157895r.mo111309a(this.f157891n.mo111232k());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    /* renamed from: e */
    public final void mo111108e() {
        int i;
        if (this.f157850J.booleanValue()) {
            AutoPollRecyclerView autoPollRecyclerView = this.f157883f;
            if (this.f157805P) {
                i = 0;
            } else {
                i = 8;
            }
            autoPollRecyclerView.setVisibility(i);
            this.f157903z = C70558b.m124608a(this.f157891n.mo111232k(), this.f157891n.mo111233l());
            this.f157843C = mo111318b(Math.min(this.f157903z, C70095p.m123775a()));
            this.f157841A = 0;
            this.f157842B = this.f157843C;
            this.f157884g.setVisibility(8);
            this.f157894q.f157809b = this.f157843C;
            C70558b bVar = this.f157894q;
            long j = this.f157903z;
            this.f157891n.mo111233l();
            bVar.mo111305b(j);
        } else {
            if (this.f157898u != 1) {
                VideoSegment videoSegment = this.f157891n.mo111232k().get(0);
                this.f157900w = new C70089d(videoSegment);
                this.f157903z = (long) (((float) videoSegment.f156710b) / videoSegment.mo110582f());
            } else {
                this.f157903z = C70558b.m124608a(this.f157891n.mo111232k(), this.f157891n.mo111233l());
            }
            this.f157841A = this.f157804O;
            long j2 = this.f157803N;
            if (j2 == 0) {
                this.f157843C = mo111318b(Math.min(this.f157903z, C70095p.m123775a()));
            } else {
                this.f157843C = j2;
            }
            this.f157842B = this.f157841A + this.f157843C;
            this.f157894q.f157809b = this.f157843C;
            if (this.f157898u == 1) {
                this.f157884g.setVisibility(8);
                this.f157883f.setVisibility(0);
                C70558b bVar2 = this.f157894q;
                long j3 = this.f157903z;
                this.f157891n.mo111233l();
                bVar2.mo111305b(j3);
            } else {
                this.f157884g.setVisibility(0);
                this.f157883f.setVisibility(8);
                this.f157894q.mo111304a(this.f157891n.mo111232k().get(0).f156710b, this.f157900w.f156750d);
            }
        }
        this.f157881d.setStartX((float) this.f157902y);
        this.f157880c.setStartX((float) ((this.f157886i - this.f157902y) - C70563d.f157831c));
        mo111313a(this.f157881d.getStartX() + ((float) C70563d.f157831c), false);
        mo111315a((int) this.f157881d.getStartX(), (int) this.f157880c.getStartX());
        if (this.f157898u == 1) {
            ArrayList arrayList = new ArrayList();
            for (VideoSegment videoSegment2 : this.f157891n.mo111232k()) {
                if (!videoSegment2.f156717i) {
                    arrayList.add(videoSegment2);
                }
            }
            this.f157895r.mo111310a(arrayList, this.f157894q.f157808a);
        } else {
            this.f157896s.mo111306a(this.f157894q.f157808a, this.f157900w.f156750d);
        }
        mo111323l();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public void setExtractFramesInRoughMode(boolean z) {
        this.f157846F = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public void setLoadThumbnailDirectly(boolean z) {
        this.f157901x = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public void setMaxVideoLength(long j) {
        this.f157889l = j;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public void setMinVideoLength(long j) {
        this.f157888k = j;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public void setMultiEditEnableForStickPointMode(boolean z) {
        this.f157805P = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public void setDefaultMode(boolean z) {
        this.f157850J = Boolean.valueOf(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70527h
    public void setCurrentRotate(int i) {
        if (this.f157898u == 2 || this.f157898u == 0) {
            this.f157900w.f156749c = i;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2.AbstractView$OnTouchListenerC70571l, com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70516a
    public void setEditViewHeight(boolean z) {
        super.setEditViewHeight(z);
        if (this.f157850J.booleanValue()) {
            m124587r();
        } else {
            m124588s();
        }
    }

    /* renamed from: c */
    private long m124585c(long j) {
        long j2 = 0;
        if (this.f157891n.mo111232k() != null && !this.f157891n.mo111232k().isEmpty()) {
            for (VideoSegment videoSegment : this.f157891n.mo111232k()) {
                if (!videoSegment.f156717i) {
                    float e = ((float) (videoSegment.mo110580e() - videoSegment.mo110578d())) / videoSegment.mo110582f();
                    float f = (float) j;
                    if (f < e) {
                        return (long) (((float) j2) + (f * videoSegment.mo110582f()));
                    }
                    j2 += videoSegment.mo110580e() - videoSegment.mo110578d();
                    j = (long) (f - e);
                }
            }
        }
        return j2;
    }

    /* renamed from: a */
    private Drawable m124582a(Boolean bool) {
        int c = C0643b.m2378c(this.f157890m, R.color.bh);
        float b = C30745b.m63132b(this.f157890m, 2.0f);
        boolean booleanValue = bool.booleanValue();
        if (getLayoutDirection() != 0 && C78099c.m136517a(this.f157890m)) {
            booleanValue = !booleanValue;
        }
        if (booleanValue) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{C84916a.m145948a(c, c, new float[]{b, b, 0.0f, 0.0f, 0.0f, 0.0f, b, b})});
            layerDrawable.setLayerInset(0, (int) this.f157887j, 0, 0, 0);
            return layerDrawable;
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{C84916a.m145948a(c, c, new float[]{0.0f, 0.0f, b, b, b, b, 0.0f, 0.0f})});
        layerDrawable2.setLayerInset(0, 0, 0, (int) this.f157887j, 0);
        return layerDrawable2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo111291a(float f) {
        int i = this.f157898u;
        if (i == 0) {
            m124583a(0, f);
            mo111142b();
        } else if (i == 1) {
            this.f157891n.mo111223c(f);
            C70558b bVar = this.f157894q;
            long j = this.f157903z;
            this.f157891n.mo111233l();
            bVar.mo111305b(j);
            this.f157895r.mo111312b(this.f157894q.f157808a, 0.0f);
            this.f157883f.mo4413b(0);
        } else if (i == 2) {
            m124583a(this.f157899v, f);
        }
        mo111325n();
        this.f157891n.mo111218b(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo111292a(long j) {
        if (!this.f157847G && !this.f157848H && j != -1 && j != 1) {
            mo111313a(this.f157881d.getStartX() + ((float) C70563d.f157831c) + (((float) (j - this.f157841A)) / this.f157894q.f157808a), false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo111293a(C0692e eVar) {
        this.f157898u = 2;
        this.f157891n.mo111208a(2);
        this.f157899v = eVar.f2751b.intValue();
        this.f157888k = 500;
        VideoSegment videoSegment = this.f157891n.mo111232k().get(this.f157899v);
        if (this.f157900w == null) {
            this.f157900w = new C70089d(videoSegment);
        } else {
            this.f157900w.mo110594a(videoSegment);
        }
        this.f157844D = this.f157841A;
        this.f157845E = this.f157842B;
        this.f157903z = (long) (((float) videoSegment.f156710b) / videoSegment.mo110582f());
        setEditViewHeight(true);
        if (this.f157850J.booleanValue()) {
            this.f157849I = videoSegment.mo110580e() - videoSegment.mo110578d();
            this.f157843C = videoSegment.mo110580e() - videoSegment.mo110578d();
            if (this.f157843C < 1000) {
                this.f157843C = 1000;
            }
            this.f157881d.setStartX((float) this.f157902y);
            this.f157880c.setStartX((float) ((this.f157886i - this.f157902y) - C70563d.f157831c));
            mo111315a((int) this.f157881d.getStartX(), (int) this.f157880c.getStartX());
            this.f157894q.f157809b = this.f157843C;
            this.f157894q.mo111304a(videoSegment.f156710b, videoSegment.mo110582f());
            this.f157841A = (long) (((float) videoSegment.mo110578d()) / videoSegment.mo110582f());
            this.f157842B = this.f157841A + this.f157843C;
        } else {
            VideoSegment videoSegment2 = this.f157891n.mo111232k().get(this.f157899v);
            long e = (long) (((float) (videoSegment2.mo110580e() - videoSegment2.mo110578d())) / videoSegment2.mo110582f());
            Boolean bool = getSingleEditFirstMap().get(videoSegment2.mo110571a(false).toString());
            if (bool == null || !bool.booleanValue()) {
                e = Math.min(e, C70095p.m123775a());
            }
            this.f157843C = mo111318b(e);
            this.f157894q.f157809b = this.f157843C;
            this.f157894q.mo111304a(videoSegment.f156710b, videoSegment.mo110582f());
            this.f157841A = (long) (((float) videoSegment.mo110578d()) / videoSegment.mo110582f());
            this.f157842B = this.f157841A + this.f157843C;
        }
        mo111142b();
        this.f157883f.setVisibility(8);
        this.f157884g.setVisibility(0);
        this.f157884g.mo4413b(0);
        this.f157896s.mo111307a(this.f157894q.f157808a, videoSegment);
        mo111323l();
        this.f157891n.mo111211a(eVar);
    }

    public VEVideoEditViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private void m124584a(VideoSegment videoSegment, boolean z) {
        if (!this.f157850J.booleanValue() && this.f157898u == 2) {
            if (z) {
                getSingleEditFirstMap().put(videoSegment.mo110571a(false).toString(), true);
            } else {
                getSingleEditFirstMap().remove(videoSegment.mo110571a(false).toString());
            }
        }
    }

    /* renamed from: a */
    private void m124583a(int i, float f) {
        float f2 = this.f157900w.f156750d;
        this.f157900w.f156750d = f;
        VideoSegment videoSegment = this.f157891n.mo111232k().get(i);
        this.f157903z = (long) (((float) videoSegment.f156710b) / f);
        this.f157843C = mo111318b(Math.max((long) ((((float) this.f157843C) * f2) / f), this.f157888k));
        this.f157894q.f157809b = this.f157843C;
        this.f157894q.mo111304a(videoSegment.f156710b, this.f157900w.f156750d);
        this.f157896s.mo111312b(this.f157894q.f157808a, f);
        mo111324m();
        this.f157841A = (long) (((float) this.f157900w.f156747a) / f);
        this.f157842B = this.f157841A + this.f157843C;
    }

    private VEVideoEditViewV2(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet);
    }
}
