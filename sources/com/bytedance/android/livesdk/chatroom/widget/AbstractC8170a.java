package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.chatroom.p488c.C7386e;
import com.bytedance.android.livesdk.model.C9537au;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.a */
public abstract class AbstractC8170a extends ConstraintLayout {

    /* renamed from: A */
    private float f20265A;

    /* renamed from: B */
    private float f20266B;

    /* renamed from: C */
    private float f20267C;

    /* renamed from: D */
    private float f20268D;

    /* renamed from: E */
    private final int f20269E;

    /* renamed from: F */
    private boolean f20270F;

    /* renamed from: G */
    private boolean f20271G;

    /* renamed from: H */
    private final AbstractC88412b f20272H;

    /* renamed from: g */
    protected final C9537au f20273g;

    /* renamed from: h */
    protected final boolean f20274h;

    /* renamed from: i */
    protected final AbstractC8172a f20275i;

    /* renamed from: j */
    public View f20276j;

    /* renamed from: k */
    protected final int[] f20277k = new int[4];

    /* renamed from: l */
    protected final int f20278l;

    /* renamed from: m */
    protected final int f20279m;

    /* renamed from: n */
    protected String f20280n;

    /* renamed from: o */
    public View f20281o;

    /* renamed from: p */
    private boolean f20282p;

    /* renamed from: q */
    private TextView f20283q;

    /* renamed from: r */
    private View f20284r;

    /* renamed from: s */
    private View f20285s;

    /* renamed from: t */
    private View f20286t;

    /* renamed from: u */
    private int[] f20287u;

    /* renamed from: v */
    private final int[] f20288v = new int[2];

    /* renamed from: w */
    private final int[] f20289w = new int[2];

    /* renamed from: x */
    private final Rect f20290x = new Rect();

    /* renamed from: y */
    private final Rect f20291y = new Rect();

    /* renamed from: z */
    private boolean f20292z;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.a$a */
    public interface AbstractC8172a {
        static {
            Covode.recordClassIndex(8995);
        }

        /* renamed from: a */
        void mo14277a(boolean z);

        /* renamed from: d */
        void mo14280d();

        /* renamed from: d */
        void mo14281d(C9537au auVar);
    }

    static {
        Covode.recordClassIndex(8993);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo14398b(View view);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract View mo14399c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo14400d();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo14402f() {
        mo14396a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo14403g() {
        mo14396a(true);
    }

    /* renamed from: e */
    public void mo14401e() {
        String str;
        C9537au auVar = this.f20273g;
        if (auVar != null) {
            str = auVar.f23162d;
        } else {
            str = "";
        }
        this.f20280n = str;
    }

    public int getType() {
        C9537au auVar = this.f20273g;
        if (auVar != null) {
            return auVar.f23165g;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC88412b bVar = this.f20272H;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* renamed from: h */
    private void m16279h() {
        this.f20268D = -1.0f;
        this.f20267C = -1.0f;
        this.f20266B = -1.0f;
        this.f20265A = -1.0f;
        this.f20282p = false;
        this.f20270F = false;
        this.f20271G = false;
    }

    public C9537au getRoomDecoration() {
        C9537au auVar = this.f20273g;
        if (auVar == null) {
            return null;
        }
        if (this.f20274h) {
            auVar.f23169k = this.f20278l;
            this.f20273g.f23170l = this.f20279m;
        }
        return this.f20273g;
    }

    /* renamed from: i */
    private boolean m16280i() {
        View view;
        if (this.f20285s == null || (view = this.f20281o) == null) {
            return false;
        }
        view.getLocationOnScreen(this.f20289w);
        m16275a(this.f20281o, this.f20290x, this.f20289w);
        this.f20290x.offset(0, this.f20281o.getMeasuredHeight() / 3);
        this.f20285s.getLocationOnScreen(this.f20288v);
        m16275a(this.f20285s, this.f20291y, this.f20288v);
        return this.f20290x.intersect(this.f20291y);
    }

    /* renamed from: b */
    public final void mo9139b() {
        View view = this.f20281o;
        if (view != null) {
            float x = view.getX();
            int[] iArr = this.f20277k;
            if (x < ((float) iArr[2])) {
                this.f20281o.setX((float) iArr[2]);
            } else {
                int[] iArr2 = this.f20277k;
                if (this.f20281o.getX() + ((float) this.f20281o.getMeasuredWidth()) > ((float) iArr2[3])) {
                    View view2 = this.f20281o;
                    view2.setX((float) (iArr2[3] - view2.getMeasuredWidth()));
                }
            }
            float y = this.f20281o.getY();
            int[] iArr3 = this.f20277k;
            if (y < ((float) iArr3[0])) {
                this.f20281o.setY((float) iArr3[0]);
                return;
            }
            int[] iArr4 = this.f20277k;
            if (this.f20281o.getY() + ((float) this.f20281o.getMeasuredHeight()) > ((float) iArr4[1])) {
                View view3 = this.f20281o;
                view3.setY((float) (iArr4[1] - view3.getMeasuredHeight()));
            }
        }
    }

    public JSONObject getDecorationInfo() {
        if (this.f20273g == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", String.valueOf(this.f20273g.f23166h));
            jSONObject.put(StringSet.type, this.f20273g.f23165g);
            jSONObject.put("content", this.f20273g.f23162d);
            jSONObject.put("x", this.f20273g.f23167i);
            jSONObject.put("y", this.f20273g.f23168j);
            jSONObject.put("w", this.f20278l);
            jSONObject.put("h", this.f20279m);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public void setText(String str) {
        this.f20280n = str;
    }

    /* renamed from: d */
    private void m16278d(boolean z) {
        if (this.f20275i != null && C3966y.m9670f()) {
            this.f20275i.mo14277a(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14396a(boolean z) {
        AbstractC8172a aVar = this.f20275i;
        if (aVar != null) {
            aVar.mo14281d(this.f20273g);
        }
    }

    /* renamed from: b */
    private void m16276b(final boolean z) {
        View view;
        int[] iArr = this.f20287u;
        if (iArr != null && (view = this.f20276j) != null) {
            int[] iArr2 = this.f20277k;
            iArr2[0] = iArr[0];
            iArr2[2] = iArr[2];
            iArr2[3] = iArr[3];
            int i = this.f20279m - iArr[1];
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i;
                this.f20276j.setLayoutParams(layoutParams);
                this.f20276j.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                    /* class com.bytedance.android.livesdk.chatroom.widget.AbstractC8170a.View$OnLayoutChangeListenerC81711 */

                    static {
                        Covode.recordClassIndex(8994);
                    }

                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        if (AbstractC8170a.this.f20276j != null) {
                            AbstractC8170a.this.f20276j.removeOnLayoutChangeListener(this);
                            AbstractC8170a.this.f20277k[1] = AbstractC8170a.this.f20276j.getTop();
                            if (z) {
                                AbstractC8170a aVar = AbstractC8170a.this;
                                aVar.f20281o = aVar.mo14399c();
                                if (AbstractC8170a.this.f20281o != null) {
                                    AbstractC8170a aVar2 = AbstractC8170a.this;
                                    aVar2.addView(aVar2.f20281o);
                                    AbstractC8170a aVar3 = AbstractC8170a.this;
                                    aVar3.mo14398b(aVar3.f20281o);
                                    return;
                                }
                                return;
                            }
                            AbstractC8170a.this.mo9139b();
                        }
                    }
                });
            }
        }
    }

    /* renamed from: c */
    private void m16277c(boolean z) {
        View view = this.f20284r;
        if (view != null) {
            if (z) {
                if (view.getVisibility() != 0) {
                    this.f20284r.setVisibility(0);
                }
            } else if (this.f20284r.getVisibility() != 4) {
                this.f20284r.setVisibility(4);
            }
        }
    }

    /* renamed from: a */
    public final void mo14397a(int[] iArr) {
        if (iArr != null) {
            this.f20287u = iArr;
            m16276b(false);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f20274h || this.f20281o == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (this.f20270F || super.onInterceptTouchEvent(motionEvent)) {
                            return true;
                        }
                        return false;
                    }
                } else if (this.f20270F) {
                    return true;
                } else {
                    if (!this.f20271G) {
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                    float abs = Math.abs(motionEvent.getX() - this.f20265A);
                    float abs2 = Math.abs(motionEvent.getY() - this.f20266B);
                    int i = this.f20269E;
                    if (abs >= ((float) i) || abs2 >= ((float) i)) {
                        this.f20267C = motionEvent.getX();
                        this.f20268D = motionEvent.getY();
                        this.f20270F = true;
                    }
                    if (this.f20270F || super.onInterceptTouchEvent(motionEvent)) {
                        return true;
                    }
                    return false;
                }
            }
            if (!this.f20270F) {
                m16279h();
            }
            if (this.f20270F || super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
        m16279h();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (x >= this.f20281o.getX() && x <= this.f20281o.getX() + ((float) this.f20281o.getMeasuredWidth()) && y >= this.f20281o.getY() && y <= this.f20281o.getY() + ((float) this.f20281o.getMeasuredHeight())) {
            this.f20265A = motionEvent.getX();
            this.f20266B = motionEvent.getY();
            this.f20271G = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        String str;
        int i;
        if (!this.f20274h || this.f20281o == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (!this.f20270F) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            if (m16280i()) {
                mo14396a(false);
            } else if (this.f20282p) {
                this.f20273g.f23167i = (int) (this.f20281o.getX() + ((float) (this.f20281o.getMeasuredWidth() / 2)));
                this.f20273g.f23168j = (int) (this.f20281o.getY() + ((float) (this.f20281o.getMeasuredHeight() / 2)));
                AbstractC8172a aVar = this.f20275i;
                if (aVar != null) {
                    aVar.mo14280d();
                }
            } else {
                mo14400d();
            }
            m16279h();
            m16277c(false);
            m16278d(false);
            return true;
        } else if (action == 2) {
            float x = motionEvent.getX() - this.f20267C;
            float y = motionEvent.getY() - this.f20268D;
            float x2 = this.f20281o.getX() + x;
            int[] iArr = this.f20277k;
            if (x2 < ((float) iArr[2])) {
                x2 = (float) iArr[2];
            }
            int[] iArr2 = this.f20277k;
            if (((float) this.f20281o.getMeasuredWidth()) + x2 > ((float) iArr2[3])) {
                x2 = (float) (iArr2[3] - this.f20281o.getMeasuredWidth());
            }
            if (x2 != this.f20281o.getX()) {
                this.f20281o.setX(x2);
                this.f20267C = motionEvent.getX();
                this.f20282p = true;
            }
            float y2 = this.f20281o.getY() + y;
            int[] iArr3 = this.f20277k;
            if (y2 < ((float) iArr3[0])) {
                y2 = (float) iArr3[0];
            }
            int[] iArr4 = this.f20277k;
            if (((float) this.f20281o.getMeasuredHeight()) + y2 > ((float) iArr4[1])) {
                y2 = (float) (iArr4[1] - this.f20281o.getMeasuredHeight());
            }
            if (y2 != this.f20281o.getY()) {
                this.f20281o.setY(y2);
                this.f20268D = motionEvent.getY();
                this.f20282p = true;
            }
            boolean i2 = m16280i();
            if (i2 != this.f20292z) {
                this.f20292z = i2;
                TextView textView = this.f20283q;
                if (textView != null) {
                    if (i2) {
                        i = 2131234878;
                    } else {
                        i = 2131234877;
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, i, 0, 0);
                }
                View view2 = this.f20285s;
                if (view2 != null) {
                    if (i2) {
                        str = "#57FF3B5C";
                    } else {
                        str = "#57000000";
                    }
                    view2.setBackgroundColor(Color.parseColor(str));
                }
            }
            if (!(this.f20286t == null || (view = this.f20281o) == null)) {
                if (view.getY() + ((float) this.f20281o.getMeasuredHeight()) >= ((float) this.f20277k[1])) {
                    if (this.f20286t.getVisibility() != 0) {
                        this.f20286t.setVisibility(0);
                    }
                } else if (this.f20286t.getVisibility() != 4) {
                    this.f20286t.setVisibility(4);
                }
            }
            m16278d(true);
            m16277c(true);
            return true;
        } else if (action != 3) {
            return true;
        } else {
            m16279h();
            m16277c(false);
            m16278d(false);
            return true;
        }
    }

    /* renamed from: a */
    private static void m16275a(View view, Rect rect, int[] iArr) {
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getMeasuredWidth();
        rect.bottom = rect.top + view.getMeasuredHeight();
    }

    public AbstractC8170a(Context context, C9537au auVar, boolean z, int[] iArr, AbstractC8172a aVar, boolean z2) {
        super(context);
        this.f20273g = auVar;
        this.f20274h = z;
        this.f20287u = iArr;
        this.f20275i = aVar;
        this.f20278l = C13628n.m24504a(getContext());
        this.f20279m = C13628n.m24521b(getContext());
        this.f20269E = ViewConfiguration.get(context).getScaledTouchSlop();
        inflate(context, R.layout.b54, this);
        this.f20284r = findViewById(R.id.c5q);
        this.f20285s = findViewById(R.id.aj4);
        this.f20276j = findViewById(R.id.v4);
        this.f20283q = (TextView) findViewById(R.id.aj5);
        this.f20286t = findViewById(R.id.v3);
        m16276b(true);
        if (z2) {
            post(new RunnableC8173b(this));
        }
        this.f20272H = C6779a.m14563a().mo13052a(C7386e.class).mo143289d(new C8174c(this));
    }
}
