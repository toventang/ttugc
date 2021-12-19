package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.core.p037h.C0769d;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.n */
public class C1465n extends RecyclerView.AbstractC1361h implements RecyclerView.AbstractC1368k {

    /* renamed from: A */
    private List<Integer> f4842A;

    /* renamed from: B */
    private RecyclerView.AbstractC1354d f4843B = null;

    /* renamed from: C */
    private C1474b f4844C;

    /* renamed from: D */
    private final RecyclerView.AbstractC1370m f4845D = new RecyclerView.AbstractC1370m() {
        /* class androidx.recyclerview.widget.C1465n.C14672 */

        static {
            Covode.recordClassIndex(1605);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
        /* renamed from: a */
        public final void mo4750a(boolean z) {
            if (z) {
                C1465n.this.mo4977a((RecyclerView.ViewHolder) null, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
        /* renamed from: a */
        public final boolean mo4751a(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            C1465n.this.f4863r.mo2893a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                C1465n.this.f4854i = motionEvent.getPointerId(0);
                C1465n.this.f4848c = motionEvent.getX();
                C1465n.this.f4849d = motionEvent.getY();
                C1465n.this.mo4973a();
                if (C1465n.this.f4847b == null) {
                    C1465n nVar = C1465n.this;
                    if (!nVar.f4857l.isEmpty()) {
                        View a = nVar.mo4972a(motionEvent);
                        int size = nVar.f4857l.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            C1475c cVar = nVar.f4857l.get(size);
                            if (cVar.f4890h.itemView == a) {
                                C1465n.this.f4848c -= cVar.f4895m;
                                C1465n.this.f4849d -= cVar.f4896n;
                                C1465n.this.mo4978a(cVar.f4890h, true);
                                if (C1465n.this.f4846a.remove(cVar.f4890h.itemView)) {
                                    C1465n.this.f4855j.mo4996d(C1465n.this.f4858m, cVar.f4890h);
                                }
                                C1465n.this.mo4977a(cVar.f4890h, cVar.f4891i);
                                C1465n nVar2 = C1465n.this;
                                nVar2.mo4975a(motionEvent, nVar2.f4856k, 0);
                            } else {
                                size--;
                            }
                        }
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                C1465n.this.f4854i = -1;
                C1465n.this.mo4977a((RecyclerView.ViewHolder) null, 0);
            } else if (C1465n.this.f4854i != -1 && (findPointerIndex = motionEvent.findPointerIndex(C1465n.this.f4854i)) >= 0) {
                C1465n.this.mo4974a(actionMasked, motionEvent, findPointerIndex);
            }
            if (C1465n.this.f4860o != null) {
                C1465n.this.f4860o.addMovement(motionEvent);
            }
            if (C1465n.this.f4847b != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
        /* renamed from: b */
        public final void mo4752b(RecyclerView recyclerView, MotionEvent motionEvent) {
            C1465n.this.f4863r.mo2893a(motionEvent);
            if (C1465n.this.f4860o != null) {
                C1465n.this.f4860o.addMovement(motionEvent);
            }
            if (C1465n.this.f4854i != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(C1465n.this.f4854i);
                if (findPointerIndex >= 0) {
                    C1465n.this.mo4974a(actionMasked, motionEvent, findPointerIndex);
                }
                RecyclerView.ViewHolder viewHolder = C1465n.this.f4847b;
                if (viewHolder != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked == 6) {
                                    int actionIndex = motionEvent.getActionIndex();
                                    if (motionEvent.getPointerId(actionIndex) == C1465n.this.f4854i) {
                                        if (actionIndex == 0) {
                                            i = 1;
                                        }
                                        C1465n.this.f4854i = motionEvent.getPointerId(i);
                                        C1465n nVar = C1465n.this;
                                        nVar.mo4975a(motionEvent, nVar.f4856k, actionIndex);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } else if (C1465n.this.f4860o != null) {
                                C1465n.this.f4860o.clear();
                            }
                        } else if (findPointerIndex >= 0) {
                            C1465n nVar2 = C1465n.this;
                            nVar2.mo4975a(motionEvent, nVar2.f4856k, findPointerIndex);
                            C1465n.this.mo4976a(viewHolder);
                            C1465n.this.f4858m.removeCallbacks(C1465n.this.f4859n);
                            C1465n.this.f4859n.run();
                            C1465n.this.f4858m.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    C1465n.this.mo4977a((RecyclerView.ViewHolder) null, 0);
                    C1465n.this.f4854i = -1;
                }
            }
        }
    };

    /* renamed from: a */
    final List<View> f4846a = new ArrayList();

    /* renamed from: b */
    RecyclerView.ViewHolder f4847b = null;

    /* renamed from: c */
    float f4848c;

    /* renamed from: d */
    float f4849d;

    /* renamed from: e */
    float f4850e;

    /* renamed from: f */
    float f4851f;

    /* renamed from: g */
    float f4852g;

    /* renamed from: h */
    float f4853h;

    /* renamed from: i */
    int f4854i = -1;

    /* renamed from: j */
    AbstractC1471a f4855j;

    /* renamed from: k */
    int f4856k;

    /* renamed from: l */
    List<C1475c> f4857l = new ArrayList();

    /* renamed from: m */
    RecyclerView f4858m;

    /* renamed from: n */
    final Runnable f4859n = new Runnable() {
        /* class androidx.recyclerview.widget.C1465n.RunnableC14661 */

        static {
            Covode.recordClassIndex(1604);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
            if (r4 < 0) goto L_0x007a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0103, code lost:
            if (r4 > 0) goto L_0x007a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00c6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 317
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1465n.RunnableC14661.run():void");
        }
    };

    /* renamed from: o */
    VelocityTracker f4860o;

    /* renamed from: p */
    View f4861p = null;

    /* renamed from: q */
    int f4862q = -1;

    /* renamed from: r */
    C0769d f4863r;

    /* renamed from: s */
    Rect f4864s;

    /* renamed from: t */
    long f4865t;

    /* renamed from: u */
    private final float[] f4866u = new float[2];

    /* renamed from: v */
    private float f4867v;

    /* renamed from: w */
    private float f4868w;

    /* renamed from: x */
    private int f4869x = 0;

    /* renamed from: y */
    private int f4870y;

    /* renamed from: z */
    private List<RecyclerView.ViewHolder> f4871z;

    /* renamed from: androidx.recyclerview.widget.n$d */
    public interface AbstractC1477d {
        static {
            Covode.recordClassIndex(1615);
        }

        /* renamed from: a */
        void mo4351a(View view, View view2);
    }

    static {
        Covode.recordClassIndex(1603);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1368k
    /* renamed from: a */
    public final void mo4747a(View view) {
    }

    /* renamed from: a */
    public final void mo4979a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4858m;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.mo4425c(this);
                this.f4858m.mo4417b(this.f4845D);
                this.f4858m.mo4416b((RecyclerView.AbstractC1368k) this);
                for (int size = this.f4857l.size() - 1; size >= 0; size--) {
                    C1475c cVar = this.f4857l.get(0);
                    cVar.f4892j.cancel();
                    this.f4855j.mo4996d(this.f4858m, cVar.f4890h);
                }
                this.f4857l.clear();
                this.f4861p = null;
                this.f4862q = -1;
                m4969b();
                C1474b bVar = this.f4844C;
                if (bVar != null) {
                    bVar.f4884a = false;
                    this.f4844C = null;
                }
                if (this.f4863r != null) {
                    this.f4863r = null;
                }
            }
            this.f4858m = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.f4867v = resources.getDimension(R.dimen.mz);
                this.f4868w = resources.getDimension(R.dimen.my);
                this.f4870y = ViewConfiguration.get(this.f4858m.getContext()).getScaledTouchSlop();
                this.f4858m.mo4402a((RecyclerView.AbstractC1361h) this);
                this.f4858m.mo4404a(this.f4845D);
                this.f4858m.mo4403a((RecyclerView.AbstractC1368k) this);
                this.f4844C = new C1474b();
                this.f4863r = new C0769d(this.f4858m.getContext(), this.f4844C);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x017c, code lost:
        if (r1 > 0) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4977a(androidx.recyclerview.widget.RecyclerView.ViewHolder r25, int r26) {
        /*
        // Method dump skipped, instructions count: 448
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1465n.mo4977a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4976a(RecyclerView.ViewHolder viewHolder) {
        if (!this.f4858m.isLayoutRequested() && this.f4869x == 2) {
            int i = (int) (this.f4852g + this.f4850e);
            int i2 = (int) (this.f4853h + this.f4851f);
            if (((float) Math.abs(i2 - viewHolder.itemView.getTop())) >= ((float) viewHolder.itemView.getHeight()) * 0.5f || ((float) Math.abs(i - viewHolder.itemView.getLeft())) >= ((float) viewHolder.itemView.getWidth()) * 0.5f) {
                List<RecyclerView.ViewHolder> list = this.f4871z;
                if (list == null) {
                    this.f4871z = new ArrayList();
                    this.f4842A = new ArrayList();
                } else {
                    list.clear();
                    this.f4842A.clear();
                }
                int round = Math.round(this.f4852g + this.f4850e) - 0;
                int round2 = Math.round(this.f4853h + this.f4851f) - 0;
                int width = viewHolder.itemView.getWidth() + round + 0;
                int height = viewHolder.itemView.getHeight() + round2 + 0;
                int i3 = (round + width) / 2;
                int i4 = (round2 + height) / 2;
                RecyclerView.AbstractC1362i layoutManager = this.f4858m.getLayoutManager();
                int s = layoutManager.mo4730s();
                for (int i5 = 0; i5 < s; i5++) {
                    View g = layoutManager.mo4717g(i5);
                    if (g != viewHolder.itemView && g.getBottom() >= round2 && g.getTop() <= height && g.getRight() >= round && g.getLeft() <= width) {
                        RecyclerView.ViewHolder a = this.f4858m.mo4393a(g);
                        if (this.f4855j.mo4991a(this.f4858m, this.f4847b, a)) {
                            int abs = Math.abs(i3 - ((g.getLeft() + g.getRight()) / 2));
                            int abs2 = Math.abs(i4 - ((g.getTop() + g.getBottom()) / 2));
                            int i6 = (abs * abs) + (abs2 * abs2);
                            int size = this.f4871z.size();
                            int i7 = 0;
                            int i8 = 0;
                            while (i8 < size && i6 > this.f4842A.get(i8).intValue()) {
                                i7++;
                                i8++;
                            }
                            this.f4871z.add(i7, a);
                            this.f4842A.add(i7, Integer.valueOf(i6));
                        }
                    }
                }
                List<RecyclerView.ViewHolder> list2 = this.f4871z;
                if (list2.size() != 0) {
                    RecyclerView.ViewHolder a2 = AbstractC1471a.m4989a(viewHolder, list2, i, i2);
                    if (a2 == null) {
                        this.f4871z.clear();
                        this.f4842A.clear();
                        return;
                    }
                    int absoluteAdapterPosition = a2.getAbsoluteAdapterPosition();
                    viewHolder.getAbsoluteAdapterPosition();
                    if (this.f4855j.mo4994b(this.f4858m, viewHolder, a2)) {
                        RecyclerView recyclerView = this.f4858m;
                        RecyclerView.AbstractC1362i layoutManager2 = recyclerView.getLayoutManager();
                        if (layoutManager2 instanceof AbstractC1477d) {
                            ((AbstractC1477d) layoutManager2).mo4351a(viewHolder.itemView, a2.itemView);
                            return;
                        }
                        if (layoutManager2.mo4366f()) {
                            if (RecyclerView.AbstractC1362i.m4431o(a2.itemView) <= recyclerView.getPaddingLeft()) {
                                recyclerView.mo4413b(absoluteAdapterPosition);
                            }
                            if (RecyclerView.AbstractC1362i.m4433q(a2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                recyclerView.mo4413b(absoluteAdapterPosition);
                            }
                        }
                        if (layoutManager2.mo4368g()) {
                            if (RecyclerView.AbstractC1362i.m4432p(a2.itemView) <= recyclerView.getPaddingTop()) {
                                recyclerView.mo4413b(absoluteAdapterPosition);
                            }
                            if (RecyclerView.AbstractC1362i.m4434r(a2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                recyclerView.mo4413b(absoluteAdapterPosition);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m4969b() {
        VelocityTracker velocityTracker = this.f4860o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4860o = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4973a() {
        VelocityTracker velocityTracker = this.f4860o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f4860o = VelocityTracker.obtain();
    }

    /* renamed from: androidx.recyclerview.widget.n$a */
    public static abstract class AbstractC1471a {

        /* renamed from: a */
        private static final Interpolator f4881a = new Interpolator() {
            /* class androidx.recyclerview.widget.C1465n.AbstractC1471a.animationInterpolatorC14721 */

            static {
                Covode.recordClassIndex(1610);
            }

            public final float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        };

        /* renamed from: b */
        private static final Interpolator f4882b = new Interpolator() {
            /* class androidx.recyclerview.widget.C1465n.AbstractC1471a.animationInterpolatorC14732 */

            static {
                Covode.recordClassIndex(1611);
            }

            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };

        /* renamed from: c */
        private int f4883c = -1;

        /* renamed from: a */
        public static int m4986a(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (i4 ^ -1);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= -789517 & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        /* renamed from: b */
        public static int m4990b(int i, int i2) {
            return (i << 16) | (i2 << 8) | ((i2 | i) << 0);
        }

        /* renamed from: c */
        public static int m4991c(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (i4 ^ -1);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= -3158065 & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        /* renamed from: a */
        public abstract int mo4986a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder);

        /* renamed from: a */
        public abstract void mo4988a(RecyclerView.ViewHolder viewHolder);

        /* renamed from: a */
        public void mo4989a(RecyclerView.ViewHolder viewHolder, int i) {
        }

        /* renamed from: a */
        public boolean mo4990a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo4991a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            return true;
        }

        /* renamed from: b */
        public boolean mo4993b() {
            return true;
        }

        /* renamed from: b */
        public abstract boolean mo4994b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2);

        static {
            Covode.recordClassIndex(1609);
        }

        /* renamed from: a */
        private int m4987a(RecyclerView recyclerView) {
            if (this.f4883c == -1) {
                this.f4883c = recyclerView.getResources().getDimensionPixelSize(R.dimen.mx);
            }
            return this.f4883c;
        }

        /* renamed from: d */
        public void mo4996d(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            C1479p.f4901a.mo5005a(viewHolder.itemView);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final boolean mo4995c(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            if ((mo4992b(recyclerView, viewHolder) & 16711680) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final int mo4992b(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return m4991c(mo4986a(recyclerView, viewHolder), C0792v.m2768e(recyclerView));
        }

        /* renamed from: a */
        public static long m4988a(RecyclerView recyclerView, int i) {
            RecyclerView.AbstractC1356f itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                if (i == 8) {
                    return 200;
                }
                return 250;
            } else if (i == 8) {
                return itemAnimator.f4469k;
            } else {
                return itemAnimator.f4468j;
            }
        }

        /* renamed from: a */
        public static RecyclerView.ViewHolder m4989a(RecyclerView.ViewHolder viewHolder, List<RecyclerView.ViewHolder> list, int i, int i2) {
            int left;
            int abs;
            int bottom;
            int abs2;
            int abs3;
            int abs4;
            int width = viewHolder.itemView.getWidth() + i;
            int height = viewHolder.itemView.getHeight() + i2;
            int left2 = i - viewHolder.itemView.getLeft();
            int top = i2 - viewHolder.itemView.getTop();
            int size = list.size();
            RecyclerView.ViewHolder viewHolder2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.ViewHolder viewHolder3 = list.get(i4);
                if (left2 > 0) {
                    int right = viewHolder3.itemView.getRight() - width;
                    if (right < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (abs4 = Math.abs(right)) > i3) {
                        viewHolder2 = viewHolder3;
                        i3 = abs4;
                    }
                } else if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (abs = Math.abs(left)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs;
                }
                if (top < 0) {
                    int top2 = viewHolder3.itemView.getTop() - i2;
                    if (top2 > 0 && viewHolder3.itemView.getTop() < viewHolder.itemView.getTop() && (abs3 = Math.abs(top2)) > i3) {
                        viewHolder2 = viewHolder3;
                        i3 = abs3;
                    }
                } else if (top > 0 && (bottom = viewHolder3.itemView.getBottom() - height) < 0 && viewHolder3.itemView.getBottom() > viewHolder.itemView.getBottom() && (abs2 = Math.abs(bottom)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs2;
                }
            }
            return viewHolder2;
        }

        /* renamed from: a */
        public final int mo4985a(RecyclerView recyclerView, int i, int i2, long j) {
            int a = m4987a(recyclerView);
            int abs = Math.abs(i2);
            float f = (float) abs;
            float f2 = 1.0f;
            int signum = (int) (((float) (((int) Math.signum((float) i2)) * a)) * f4882b.getInterpolation(Math.min(1.0f, (f * 1.0f) / ((float) i))));
            if (j <= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                f2 = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (((float) signum) * f4881a.getInterpolation(f2));
            if (interpolation != 0) {
                return interpolation;
            }
            if (i2 > 0) {
                return 1;
            }
            return -1;
        }

        /* renamed from: a */
        public void mo4987a(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            C1479p.f4901a.mo5006a(recyclerView, viewHolder.itemView, f, f2, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.n$c */
    public static class C1475c implements Animator.AnimatorListener {

        /* renamed from: d */
        final float f4886d;

        /* renamed from: e */
        final float f4887e;

        /* renamed from: f */
        final float f4888f;

        /* renamed from: g */
        final float f4889g;

        /* renamed from: h */
        final RecyclerView.ViewHolder f4890h;

        /* renamed from: i */
        final int f4891i;

        /* renamed from: j */
        final ValueAnimator f4892j;

        /* renamed from: k */
        final int f4893k;

        /* renamed from: l */
        boolean f4894l;

        /* renamed from: m */
        float f4895m;

        /* renamed from: n */
        float f4896n;

        /* renamed from: o */
        boolean f4897o;

        /* renamed from: p */
        boolean f4898p;

        /* renamed from: q */
        public float f4899q = 0.0f;

        static {
            Covode.recordClassIndex(1613);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onAnimationCancel(Animator animator) {
            this.f4899q = 1.0f;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f4898p) {
                this.f4890h.setIsRecyclable(true);
            }
            this.f4898p = true;
        }

        C1475c(RecyclerView.ViewHolder viewHolder, int i, int i2, float f, float f2, float f3, float f4) {
            this.f4891i = i2;
            this.f4893k = i;
            this.f4890h = viewHolder;
            this.f4886d = f;
            this.f4887e = f2;
            this.f4888f = f3;
            this.f4889g = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f4892j = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class androidx.recyclerview.widget.C1465n.C1475c.C14761 */

                static {
                    Covode.recordClassIndex(1614);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C1475c.this.f4899q = valueAnimator.getAnimatedFraction();
                }
            });
            ofFloat.setTarget(viewHolder.itemView);
            ofFloat.addListener(this);
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$b */
    class C1474b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        boolean f4884a = true;

        static {
            Covode.recordClassIndex(1612);
        }

        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        C1474b() {
        }

        public final void onLongPress(MotionEvent motionEvent) {
            View a;
            RecyclerView.ViewHolder a2;
            if (this.f4884a && (a = C1465n.this.mo4972a(motionEvent)) != null && (a2 = C1465n.this.f4858m.mo4393a(a)) != null && C1465n.this.f4855j.mo4995c(C1465n.this.f4858m, a2) && motionEvent.getPointerId(0) == C1465n.this.f4854i) {
                int findPointerIndex = motionEvent.findPointerIndex(C1465n.this.f4854i);
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                C1465n.this.f4848c = x;
                C1465n.this.f4849d = y;
                C1465n nVar = C1465n.this;
                nVar.f4851f = 0.0f;
                nVar.f4850e = 0.0f;
                if (C1465n.this.f4855j.mo4990a()) {
                    C1465n.this.mo4977a(a2, 2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4981c(View view) {
        if (view == this.f4861p) {
            this.f4861p = null;
            if (this.f4843B != null) {
                this.f4858m.setChildDrawingOrderCallback(null);
            }
        }
    }

    public C1465n(AbstractC1471a aVar) {
        this.f4855j = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1368k
    /* renamed from: b */
    public final void mo4748b(View view) {
        mo4981c(view);
        RecyclerView.ViewHolder a = this.f4858m.mo4393a(view);
        if (a != null) {
            RecyclerView.ViewHolder viewHolder = this.f4847b;
            if (viewHolder == null || a != viewHolder) {
                mo4978a(a, false);
                if (this.f4846a.remove(a.itemView)) {
                    this.f4855j.mo4996d(this.f4858m, a);
                    return;
                }
                return;
            }
            mo4977a((RecyclerView.ViewHolder) null, 0);
        }
    }

    /* renamed from: a */
    private int m4965a(int i) {
        int i2;
        if ((i & 12) == 0) {
            return 0;
        }
        int i3 = 8;
        if (this.f4850e > 0.0f) {
            i2 = 8;
        } else {
            i2 = 4;
        }
        VelocityTracker velocityTracker = this.f4860o;
        if (velocityTracker != null && this.f4854i >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.f4868w);
            float xVelocity = this.f4860o.getXVelocity(this.f4854i);
            float yVelocity = this.f4860o.getYVelocity(this.f4854i);
            if (xVelocity <= 0.0f) {
                i3 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= this.f4867v && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = ((float) this.f4858m.getWidth()) * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f4850e) <= width) {
            return 0;
        }
        return i2;
    }

    /* renamed from: b */
    private int m4968b(int i) {
        int i2;
        if ((i & 3) == 0) {
            return 0;
        }
        int i3 = 2;
        if (this.f4851f > 0.0f) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        VelocityTracker velocityTracker = this.f4860o;
        if (velocityTracker != null && this.f4854i >= 0) {
            velocityTracker.computeCurrentVelocity(1000, this.f4868w);
            float xVelocity = this.f4860o.getXVelocity(this.f4854i);
            float yVelocity = this.f4860o.getYVelocity(this.f4854i);
            if (yVelocity <= 0.0f) {
                i3 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= this.f4867v && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = ((float) this.f4858m.getHeight()) * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f4851f) <= height) {
            return 0;
        }
        return i2;
    }

    /* renamed from: a */
    private void m4966a(float[] fArr) {
        if ((this.f4856k & 12) != 0) {
            fArr[0] = (this.f4852g + this.f4850e) - ((float) this.f4847b.itemView.getLeft());
        } else {
            fArr[0] = this.f4847b.itemView.getTranslationX();
        }
        if ((this.f4856k & 3) != 0) {
            fArr[1] = (this.f4853h + this.f4851f) - ((float) this.f4847b.itemView.getTop());
        } else {
            fArr[1] = this.f4847b.itemView.getTranslationY();
        }
    }

    /* renamed from: b */
    public final void mo4980b(RecyclerView.ViewHolder viewHolder) {
        if (this.f4855j.mo4995c(this.f4858m, viewHolder) && viewHolder.itemView.getParent() == this.f4858m) {
            mo4973a();
            this.f4851f = 0.0f;
            this.f4850e = 0.0f;
            mo4977a(viewHolder, 2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo4972a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.ViewHolder viewHolder = this.f4847b;
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (m4967a(view, x, y, this.f4852g + this.f4850e, this.f4853h + this.f4851f)) {
                return view;
            }
        }
        for (int size = this.f4857l.size() - 1; size >= 0; size--) {
            C1475c cVar = this.f4857l.get(size);
            View view2 = cVar.f4890h.itemView;
            if (m4967a(view2, x, y, cVar.f4895m, cVar.f4896n)) {
                return view2;
            }
        }
        return this.f4858m.mo4391a(x, y);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4978a(RecyclerView.ViewHolder viewHolder, boolean z) {
        for (int size = this.f4857l.size() - 1; size >= 0; size--) {
            C1475c cVar = this.f4857l.get(size);
            if (cVar.f4890h == viewHolder) {
                cVar.f4897o |= z;
                if (!cVar.f4898p) {
                    cVar.f4892j.cancel();
                }
                this.f4857l.remove(size);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        if (this.f4847b != null) {
            m4966a(this.f4866u);
        }
        RecyclerView.ViewHolder viewHolder = this.f4847b;
        List<C1475c> list = this.f4857l;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            list.get(i);
            canvas.restoreToCount(canvas.save());
        }
        if (viewHolder != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C1475c cVar = list.get(i2);
            if (cVar.f4898p && !cVar.f4894l) {
                list.remove(i2);
            } else if (!cVar.f4898p) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        float f;
        float f2;
        this.f4862q = -1;
        if (this.f4847b != null) {
            m4966a(this.f4866u);
            float[] fArr = this.f4866u;
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AbstractC1471a aVar = this.f4855j;
        RecyclerView.ViewHolder viewHolder = this.f4847b;
        List<C1475c> list = this.f4857l;
        int i = this.f4869x;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1475c cVar = list.get(i2);
            if (cVar.f4886d == cVar.f4888f) {
                cVar.f4895m = cVar.f4890h.itemView.getTranslationX();
            } else {
                cVar.f4895m = cVar.f4886d + (cVar.f4899q * (cVar.f4888f - cVar.f4886d));
            }
            if (cVar.f4887e == cVar.f4889g) {
                cVar.f4896n = cVar.f4890h.itemView.getTranslationY();
            } else {
                cVar.f4896n = cVar.f4887e + (cVar.f4899q * (cVar.f4889g - cVar.f4887e));
            }
            int save = canvas.save();
            aVar.mo4987a(canvas, recyclerView, cVar.f4890h, cVar.f4895m, cVar.f4896n, cVar.f4891i, false);
            canvas.restoreToCount(save);
        }
        if (viewHolder != null) {
            int save2 = canvas.save();
            aVar.mo4987a(canvas, recyclerView, viewHolder, f, f2, i, true);
            canvas.restoreToCount(save2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4974a(int i, MotionEvent motionEvent, int i2) {
        View a;
        RecyclerView.ViewHolder a2;
        int b;
        if (this.f4847b == null && i == 2 && this.f4869x != 2 && this.f4855j.mo4993b() && this.f4858m.getScrollState() != 1) {
            RecyclerView.AbstractC1362i layoutManager = this.f4858m.getLayoutManager();
            int i3 = this.f4854i;
            if (i3 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i3);
                float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f4848c);
                float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f4849d);
                int i4 = this.f4870y;
                if (abs < ((float) i4) && abs2 < ((float) i4)) {
                    return;
                }
                if (abs > abs2 && layoutManager.mo4366f()) {
                    return;
                }
                if ((abs2 <= abs || !layoutManager.mo4368g()) && (a = mo4972a(motionEvent)) != null && (a2 = this.f4858m.mo4393a(a)) != null && (b = (this.f4855j.mo4992b(this.f4858m, a2) & 65280) >> 8) != 0) {
                    float x = motionEvent.getX(i2);
                    float y = motionEvent.getY(i2);
                    float f = x - this.f4848c;
                    float f2 = y - this.f4849d;
                    float abs3 = Math.abs(f);
                    float abs4 = Math.abs(f2);
                    int i5 = this.f4870y;
                    if (abs3 >= ((float) i5) || abs4 >= ((float) i5)) {
                        if (abs3 > abs4) {
                            if (f < 0.0f && (b & 4) == 0) {
                                return;
                            }
                            if (f > 0.0f && (b & 8) == 0) {
                                return;
                            }
                        } else if (f2 < 0.0f && (b & 1) == 0) {
                            return;
                        } else {
                            if (f2 > 0.0f && (b & 2) == 0) {
                                return;
                            }
                        }
                        this.f4851f = 0.0f;
                        this.f4850e = 0.0f;
                        this.f4854i = motionEvent.getPointerId(0);
                        mo4977a(a2, 1);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4975a(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f4848c;
        this.f4850e = f;
        this.f4851f = y - this.f4849d;
        if ((i & 4) == 0) {
            this.f4850e = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f4850e = Math.min(0.0f, this.f4850e);
        }
        if ((i & 1) == 0) {
            this.f4851f = Math.max(0.0f, this.f4851f);
        }
        if ((i & 2) == 0) {
            this.f4851f = Math.min(0.0f, this.f4851f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        rect.setEmpty();
    }

    /* renamed from: a */
    private static boolean m4967a(View view, float f, float f2, float f3, float f4) {
        if (f < f3 || f > f3 + ((float) view.getWidth()) || f2 < f4 || f2 > f4 + ((float) view.getHeight())) {
            return false;
        }
        return true;
    }
}
