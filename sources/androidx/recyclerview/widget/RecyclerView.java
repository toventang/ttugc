package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.p033d.C0654g;
import androidx.core.p036g.C0697g;
import androidx.core.p037h.AbstractC0781k;
import androidx.core.p037h.AbstractC0782l;
import androidx.core.p037h.AbstractC0790t;
import androidx.core.p037h.C0779i;
import androidx.core.p037h.C0783m;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.C0802w;
import androidx.core.p037h.p038a.C0729b;
import androidx.core.p037h.p038a.C0733d;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.C1387a;
import androidx.recyclerview.widget.C1403ae;
import androidx.recyclerview.widget.C1406af;
import androidx.recyclerview.widget.C1425f;
import androidx.recyclerview.widget.C1496z;
import androidx.recyclerview.widget.RunnableC1461m;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58012c;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

public class RecyclerView extends ViewGroup implements AbstractC0781k, AbstractC0782l, AbstractC0790t {

    /* renamed from: N */
    static final Interpolator f4371N = new Interpolator() {
        /* class androidx.recyclerview.widget.RecyclerView.animationInterpolatorC13443 */

        static {
            Covode.recordClassIndex(1474);
        }

        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: O */
    private static final int[] f4372O = {16843830};

    /* renamed from: P */
    private static final boolean f4373P = false;

    /* renamed from: Q */
    private static final boolean f4374Q = false;

    /* renamed from: R */
    private static final Class<?>[] f4375R = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};

    /* renamed from: a */
    static final boolean f4376a;

    /* renamed from: b */
    static final boolean f4377b;

    /* renamed from: c */
    static final boolean f4378c = true;

    /* renamed from: d */
    static final boolean f4379d;

    /* renamed from: A */
    boolean f4380A;

    /* renamed from: B */
    boolean f4381B;

    /* renamed from: C */
    AbstractC1356f f4382C;

    /* renamed from: D */
    final RunnableC1380u f4383D;

    /* renamed from: E */
    RunnableC1461m f4384E;

    /* renamed from: F */
    RunnableC1461m.C1463a f4385F;

    /* renamed from: G */
    final C1378s f4386G;

    /* renamed from: H */
    boolean f4387H;

    /* renamed from: I */
    boolean f4388I;

    /* renamed from: J */
    boolean f4389J;

    /* renamed from: K */
    C1496z f4390K;

    /* renamed from: L */
    final int[] f4391L;

    /* renamed from: M */
    final List<ViewHolder> f4392M;

    /* renamed from: S */
    private final C1374q f4393S;

    /* renamed from: T */
    private final Rect f4394T;

    /* renamed from: U */
    private final ArrayList<AbstractC1370m> f4395U;

    /* renamed from: V */
    private AbstractC1370m f4396V;

    /* renamed from: W */
    private int f4397W;

    /* renamed from: aA */
    private AbstractC1356f.AbstractC1358b f4398aA;

    /* renamed from: aB */
    private AbstractC1354d f4399aB;

    /* renamed from: aC */
    private final int[] f4400aC;

    /* renamed from: aD */
    private C0783m f4401aD;

    /* renamed from: aE */
    private final int[] f4402aE;

    /* renamed from: aF */
    private final int[] f4403aF;

    /* renamed from: aG */
    private Runnable f4404aG;

    /* renamed from: aH */
    private boolean f4405aH;

    /* renamed from: aI */
    private int f4406aI;

    /* renamed from: aJ */
    private int f4407aJ;

    /* renamed from: aK */
    private final C1406af.AbstractC1408b f4408aK;

    /* renamed from: aa */
    private boolean f4409aa;

    /* renamed from: ab */
    private int f4410ab;

    /* renamed from: ac */
    private final AccessibilityManager f4411ac;

    /* renamed from: ad */
    private int f4412ad;

    /* renamed from: ae */
    private int f4413ae;

    /* renamed from: af */
    private C1355e f4414af;

    /* renamed from: ag */
    private EdgeEffect f4415ag;

    /* renamed from: ah */
    private EdgeEffect f4416ah;

    /* renamed from: ai */
    private EdgeEffect f4417ai;

    /* renamed from: aj */
    private EdgeEffect f4418aj;

    /* renamed from: ak */
    private int f4419ak;

    /* renamed from: al */
    private int f4420al;

    /* renamed from: am */
    private VelocityTracker f4421am;

    /* renamed from: an */
    private int f4422an;

    /* renamed from: ao */
    private int f4423ao;

    /* renamed from: ap */
    private int f4424ap;

    /* renamed from: aq */
    private int f4425aq;

    /* renamed from: ar */
    private int f4426ar;

    /* renamed from: as */
    private AbstractC1369l f4427as;

    /* renamed from: at */
    private final int f4428at;

    /* renamed from: au */
    private final int f4429au;

    /* renamed from: av */
    private float f4430av;

    /* renamed from: aw */
    private float f4431aw;

    /* renamed from: ax */
    private boolean f4432ax;

    /* renamed from: ay */
    private AbstractC1371n f4433ay;

    /* renamed from: az */
    private List<AbstractC1371n> f4434az;

    /* renamed from: e */
    public final C1372o f4435e;

    /* renamed from: f */
    SavedState f4436f;

    /* renamed from: g */
    C1387a f4437g;

    /* renamed from: h */
    C1425f f4438h;

    /* renamed from: i */
    final C1406af f4439i;

    /* renamed from: j */
    boolean f4440j;

    /* renamed from: k */
    final Runnable f4441k;

    /* renamed from: l */
    final Rect f4442l;

    /* renamed from: m */
    final RectF f4443m;

    /* renamed from: n */
    AbstractC1350a f4444n;

    /* renamed from: o */
    AbstractC1362i f4445o;

    /* renamed from: p */
    AbstractC1373p f4446p;

    /* renamed from: q */
    final List<AbstractC1373p> f4447q;

    /* renamed from: r */
    final ArrayList<AbstractC1361h> f4448r;

    /* renamed from: s */
    boolean f4449s;

    /* renamed from: t */
    public boolean f4450t;

    /* renamed from: u */
    boolean f4451u;

    /* renamed from: v */
    boolean f4452v;

    /* renamed from: w */
    boolean f4453w;

    /* renamed from: x */
    boolean f4454x;

    /* renamed from: y */
    boolean f4455y;

    /* renamed from: z */
    List<AbstractC1368k> f4456z;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public interface AbstractC1354d {
        static {
            Covode.recordClassIndex(1488);
        }

        /* renamed from: a */
        int mo4662a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public interface AbstractC1368k {
        static {
            Covode.recordClassIndex(1502);
        }

        /* renamed from: a */
        void mo4747a(View view);

        /* renamed from: b */
        void mo4748b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class AbstractC1369l {
        static {
            Covode.recordClassIndex(1503);
        }

        /* renamed from: a */
        public abstract boolean mo4749a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public interface AbstractC1370m {
        static {
            Covode.recordClassIndex(1504);
        }

        /* renamed from: a */
        void mo4750a(boolean z);

        /* renamed from: a */
        boolean mo4751a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        void mo4752b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class AbstractC1371n {
        static {
            Covode.recordClassIndex(1505);
        }

        /* renamed from: a */
        public void mo4753a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: a */
        public void mo4754a(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public interface AbstractC1373p {
        static {
            Covode.recordClassIndex(1507);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class AbstractC1379t {
        static {
            Covode.recordClassIndex(1513);
        }

        /* renamed from: a */
        public abstract View mo4785a(C1372o oVar, int i);
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public void scrollTo(int i, int i2) {
    }

    public static abstract class ViewHolder {
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        public final View itemView;
        AbstractC1350a<? extends ViewHolder> mBindingAdapter;
        int mFlags;
        boolean mInChangeScrap;
        private int mIsRecyclableCount;
        long mItemId = -1;
        int mItemViewType = -1;
        WeakReference<RecyclerView> mNestedRecyclerView;
        int mOldPosition = -1;
        RecyclerView mOwnerRecyclerView;
        List<Object> mPayloads;
        int mPendingAccessibilityState = -1;
        int mPosition = -1;
        int mPreLayoutPosition = -1;
        C1372o mScrapContainer;
        ViewHolder mShadowedHolder;
        ViewHolder mShadowingHolder;
        List<Object> mUnmodifiedPayloads;
        private int mWasImportantForAccessibilityBeforeHidden;

        /* renamed from: androidx_recyclerview_widget_RecyclerView$ViewHolder_com_ss_android_ugc_aweme_lancet_LogLancet_e */
        public static int m4376x7e0061d0(String str, String str2) {
            return 0;
        }

        public final AbstractC1350a<? extends ViewHolder> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        /* access modifiers changed from: package-private */
        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        /* access modifiers changed from: package-private */
        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        /* access modifiers changed from: package-private */
        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            if (i == -1) {
                return this.mPosition;
            }
            return i;
        }

        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            if (i == -1) {
                return this.mPosition;
            }
            return i;
        }

        /* access modifiers changed from: package-private */
        public boolean isScrap() {
            if (this.mScrapContainer != null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        /* access modifiers changed from: package-private */
        public void unScrap() {
            this.mScrapContainer.mo4765b(this);
        }

        static {
            Covode.recordClassIndex(1483);
        }

        /* access modifiers changed from: package-private */
        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.mo4433d(this);
        }

        /* access modifiers changed from: package-private */
        public boolean isAdapterPositionUnknown() {
            if ((this.mFlags & 512) != 0 || isInvalid()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean isBound() {
            if ((this.mFlags & 1) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean isInvalid() {
            if ((this.mFlags & 4) != 0) {
                return true;
            }
            return false;
        }

        public boolean isRemoved() {
            if ((this.mFlags & 8) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean isTmpDetached() {
            if ((this.mFlags & 256) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean isUpdated() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean needsUpdate() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean shouldBeKeptAsChild() {
            if ((this.mFlags & 16) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean shouldIgnore() {
            if ((this.mFlags & 128) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean wasReturnedFromScrap() {
            if ((this.mFlags & 32) != 0) {
                return true;
            }
            return false;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) != 0 || !C0792v.m2760b(this.itemView)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            if (list == null || list.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }

        /* access modifiers changed from: package-private */
        public boolean isAttachedToTransitionOverlay() {
            if (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) {
                return false;
            }
            return true;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) != 0 || C0792v.m2760b(this.itemView)) {
                return false;
            }
            return true;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.m4276c(this);
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            AbstractC1350a adapter;
            int d;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (d = this.mOwnerRecyclerView.mo4433d(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, d);
        }

        public String toString() {
            String simpleName;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                StringBuilder append = sb.append(" scrap ");
                if (this.mInChangeScrap) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                append.append(str);
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        /* access modifiers changed from: package-private */
        public boolean hasAnyOfTheFlags(int i) {
            if ((i & this.mFlags) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.mo4409a(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public ViewHolder(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* access modifiers changed from: package-private */
        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = C0792v.m2766d(this.itemView);
            }
            recyclerView.mo4409a(this, 4);
        }

        public final void setIsRecyclable(boolean z) {
            int i;
            int i2 = this.mIsRecyclableCount;
            if (z) {
                i = i2 - 1;
            } else {
                i = i2 + 1;
            }
            this.mIsRecyclableCount = i;
            if (i < 0) {
                this.mIsRecyclableCount = 0;
                m4376x7e0061d0("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ".concat(String.valueOf(this)));
            } else if (!z) {
                if (i == 1) {
                    this.mFlags |= 16;
                }
            } else if (i == 0) {
                this.mFlags &= -17;
            }
        }

        /* access modifiers changed from: package-private */
        public void setScrapContainer(C1372o oVar, boolean z) {
            this.mScrapContainer = oVar;
            this.mInChangeScrap = z;
        }

        /* access modifiers changed from: package-private */
        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (i2 ^ -1));
        }

        /* access modifiers changed from: package-private */
        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((C1367j) this.itemView.getLayoutParams()).f4502e = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public static class C1352b extends Observable<AbstractC1353c> {
        static {
            Covode.recordClassIndex(1486);
        }

        C1352b() {
        }

        /* renamed from: a */
        public final boolean mo4649a() {
            if (!this.mObservers.isEmpty()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final void mo4650b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1353c) this.mObservers.get(size)).mo4655a();
            }
        }

        /* renamed from: c */
        public final void mo4652c() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1353c) this.mObservers.get(size)).mo4659b();
            }
        }

        /* renamed from: a */
        public final void mo4647a(int i, int i2) {
            mo4648a(i, i2, null);
        }

        /* renamed from: d */
        public final void mo4654d(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1353c) this.mObservers.get(size)).mo4657a(i, i2, 1);
            }
        }

        /* renamed from: b */
        public final void mo4651b(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1353c) this.mObservers.get(size)).mo4660b(i, i2);
            }
        }

        /* renamed from: c */
        public final void mo4653c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1353c) this.mObservers.get(size)).mo4661c(i, i2);
            }
        }

        /* renamed from: a */
        public final void mo4648a(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1353c) this.mObservers.get(size)).mo4658a(i, i2, obj);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class AbstractC1362i {

        /* renamed from: A */
        boolean f4476A = false;

        /* renamed from: B */
        public boolean f4477B = false;

        /* renamed from: C */
        public boolean f4478C = false;

        /* renamed from: D */
        public boolean f4479D = true;

        /* renamed from: E */
        public boolean f4480E = true;

        /* renamed from: F */
        public int f4481F;

        /* renamed from: G */
        boolean f4482G;

        /* renamed from: H */
        public int f4483H;

        /* renamed from: I */
        public int f4484I;

        /* renamed from: J */
        public int f4485J;

        /* renamed from: K */
        public int f4486K;

        /* renamed from: a */
        private final C1403ae.AbstractC1405b f4487a;

        /* renamed from: b */
        private final C1403ae.AbstractC1405b f4488b;

        /* renamed from: v */
        C1425f f4489v;

        /* renamed from: w */
        public RecyclerView f4490w;

        /* renamed from: x */
        C1403ae f4491x;

        /* renamed from: y */
        C1403ae f4492y;

        /* renamed from: z */
        AbstractC1375r f4493z;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$i$a */
        public interface AbstractC1365a {
            static {
                Covode.recordClassIndex(1499);
            }

            /* renamed from: a */
            void mo4743a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$i$b */
        public static class C1366b {

            /* renamed from: a */
            public int f4496a;

            /* renamed from: b */
            public int f4497b;

            /* renamed from: c */
            public boolean f4498c;

            /* renamed from: d */
            public boolean f4499d;

            static {
                Covode.recordClassIndex(1500);
            }
        }

        static {
            Covode.recordClassIndex(1496);
        }

        /* renamed from: a */
        public int mo4312a(int i, C1372o oVar, C1378s sVar) {
            return 0;
        }

        /* renamed from: a */
        public int mo4313a(C1372o oVar, C1378s sVar) {
            return -1;
        }

        /* renamed from: a */
        public View mo4314a(View view, int i, C1372o oVar, C1378s sVar) {
            return null;
        }

        /* renamed from: a */
        public void mo4348a(int i, int i2, C1378s sVar, AbstractC1365a aVar) {
        }

        /* renamed from: a */
        public void mo4349a(int i, AbstractC1365a aVar) {
        }

        /* renamed from: a */
        public void mo4350a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo4692a(AbstractC1350a aVar, AbstractC1350a aVar2) {
        }

        /* renamed from: a */
        public void mo4321a(C1372o oVar, C1378s sVar, View view, C0733d dVar) {
        }

        /* renamed from: a */
        public void mo4324a(C1378s sVar) {
        }

        /* renamed from: a */
        public void mo4326a(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: a */
        public void mo4327a(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: a */
        public void mo4353a(RecyclerView recyclerView, C1372o oVar) {
        }

        /* renamed from: a */
        public void mo4354a(RecyclerView recyclerView, C1378s sVar, int i) {
        }

        /* renamed from: a */
        public boolean mo4330a(C1367j jVar) {
            return jVar != null;
        }

        /* renamed from: b */
        public int mo4331b(int i, C1372o oVar, C1378s sVar) {
            return 0;
        }

        /* renamed from: b */
        public int mo4332b(C1372o oVar, C1378s sVar) {
            return -1;
        }

        /* renamed from: b */
        public int mo4333b(C1378s sVar) {
            return 0;
        }

        /* renamed from: b */
        public abstract C1367j mo4334b();

        /* renamed from: b */
        public void mo4335b(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: c */
        public int mo4336c(C1378s sVar) {
            return 0;
        }

        /* renamed from: c */
        public void mo4337c(C1372o oVar, C1378s sVar) {
        }

        /* renamed from: c */
        public void mo4712c(RecyclerView recyclerView) {
        }

        /* renamed from: c */
        public void mo4713c(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: d */
        public int mo4338d(C1378s sVar) {
            return 0;
        }

        /* renamed from: e */
        public int mo4339e(C1378s sVar) {
            return 0;
        }

        /* renamed from: e */
        public Parcelable mo4362e() {
            return null;
        }

        /* renamed from: e */
        public void mo4363e(int i) {
        }

        /* renamed from: f */
        public int mo4365f(C1378s sVar) {
            return 0;
        }

        /* renamed from: f */
        public boolean mo4366f() {
            return false;
        }

        /* renamed from: g */
        public int mo4367g(C1378s sVar) {
            return 0;
        }

        /* renamed from: g */
        public boolean mo4368g() {
            return false;
        }

        /* renamed from: j */
        public void mo4723j(int i) {
        }

        /* renamed from: x_ */
        public boolean mo4340x_() {
            return false;
        }

        /* renamed from: y_ */
        public void mo4341y_() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z_ */
        public boolean mo4376z_() {
            return false;
        }

        /* renamed from: w_ */
        public boolean mo4375w_() {
            return this.f4478C;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4696a(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f4490w = null;
                this.f4489v = null;
                this.f4485J = 0;
                this.f4486K = 0;
            } else {
                this.f4490w = recyclerView;
                this.f4489v = recyclerView.f4438h;
                this.f4485J = recyclerView.getWidth();
                this.f4486K = recyclerView.getHeight();
            }
            this.f4483H = 1073741824;
            this.f4484I = 1073741824;
        }

        /* renamed from: a */
        public void mo4319a(Rect rect, int i, int i2) {
            mo4714d(m4413a(i, rect.width() + mo4731t() + mo4733v(), C0792v.m2774h(this.f4490w)), m4413a(i2, rect.height() + mo4732u() + mo4734w(), C0792v.m2775i(this.f4490w)));
        }

        /* renamed from: a */
        public void mo4355a(String str) {
            RecyclerView recyclerView = this.f4490w;
            if (recyclerView != null) {
                recyclerView.mo4437d_(str);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo4705b(RecyclerView recyclerView) {
            this.f4477B = true;
            mo4712c(recyclerView);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo4706b(RecyclerView recyclerView, C1372o oVar) {
            this.f4477B = false;
            mo4353a(recyclerView, oVar);
        }

        /* renamed from: a */
        public final boolean mo4699a(Runnable runnable) {
            RecyclerView recyclerView = this.f4490w;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: a */
        public C1367j mo4317a(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof C1367j) {
                return new C1367j((C1367j) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new C1367j((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new C1367j(layoutParams);
        }

        /* renamed from: a */
        public C1367j mo4316a(Context context, AttributeSet attributeSet) {
            return new C1367j(context, attributeSet);
        }

        /* renamed from: a */
        public final void mo4695a(AbstractC1375r rVar) {
            AbstractC1375r rVar2 = this.f4493z;
            if (!(rVar2 == null || rVar == rVar2 || !rVar2.f4519k)) {
                this.f4493z.mo4779d();
            }
            this.f4493z = rVar;
            RecyclerView recyclerView = this.f4490w;
            recyclerView.f4383D.mo4788b();
            if (rVar.f4521m) {
                rVar.getClass().getSimpleName();
                rVar.getClass().getSimpleName();
            }
            rVar.f4516h = recyclerView;
            rVar.f4517i = this;
            if (rVar.f4515g != -1) {
                rVar.f4516h.f4386G.f4529a = rVar.f4515g;
                rVar.f4519k = true;
                rVar.f4518j = true;
                rVar.f4520l = rVar.f4516h.f4445o.mo4358c(rVar.f4515g);
                rVar.f4516h.f4383D.mo4786a();
                rVar.f4521m = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* renamed from: a */
        public final void mo4688a(View view, int i) {
            m4419a(view, i, false);
        }

        /* renamed from: a */
        public final void mo4691a(View view, C1372o oVar) {
            mo4715d(view);
            oVar.mo4757a(view);
        }

        /* renamed from: a */
        public final void mo4687a(int i, C1372o oVar) {
            View g = mo4717g(i);
            mo4318a(i);
            oVar.mo4757a(g);
        }

        /* renamed from: a */
        public final void mo4693a(C1372o oVar) {
            for (int s = mo4730s() - 1; s >= 0; s--) {
                View g = mo4717g(s);
                ViewHolder c = RecyclerView.m4275c(g);
                if (!c.shouldIgnore()) {
                    if (!c.isInvalid() || c.isRemoved() || this.f4490w.f4444n.mHasStableIds) {
                        mo4356b(s);
                        oVar.mo4768c(g);
                        this.f4490w.f4439i.mo4881d(c);
                    } else {
                        mo4318a(s);
                        oVar.mo4759a(c);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo4697a(View view, int i, int i2, C1367j jVar) {
            return !this.f4479D || !m4422b(view.getMeasuredWidth(), i, jVar.width) || !m4422b(view.getMeasuredHeight(), i2, jVar.height);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean mo4707b(View view, int i, int i2, C1367j jVar) {
            return view.isLayoutRequested() || !this.f4479D || !m4422b(view.getWidth(), i, jVar.width) || !m4422b(view.getHeight(), i2, jVar.height);
        }

        /* renamed from: a */
        public final void mo4689a(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((C1367j) view.getLayoutParams()).f4501d;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (!(this.f4490w == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f4490w.f4443m;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: a */
        public final boolean mo4698a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] c = m4423c(view, rect);
            int i = c[0];
            int i2 = c[1];
            if ((z2 && !m4425d(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.mo4395a(i, i2);
            }
            return true;
        }

        /* renamed from: a */
        public void mo4328a(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo4713c(recyclerView, i, i2);
        }

        /* renamed from: a */
        public void mo4694a(C1372o oVar, C1378s sVar, int i, int i2) {
            this.f4490w.mo4449e(i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4690a(View view, C0733d dVar) {
            ViewHolder c = RecyclerView.m4275c(view);
            if (c != null && !c.isRemoved() && !this.f4489v.mo4905d(c.itemView)) {
                mo4321a(this.f4490w.f4435e, this.f4490w.f4386G, view, dVar);
            }
        }

        /* renamed from: a */
        public void mo4352a(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4490w;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f4490w.canScrollVertically(-1) && !this.f4490w.canScrollHorizontally(-1) && !this.f4490w.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                if (this.f4490w.f4444n != null) {
                    accessibilityEvent.setItemCount(this.f4490w.f4444n.getItemCount());
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public final void mo4686B() {
            AbstractC1375r rVar = this.f4493z;
            if (rVar != null) {
                rVar.mo4779d();
            }
        }

        /* renamed from: o */
        public final void mo4726o() {
            RecyclerView recyclerView = this.f4490w;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: w */
        public final int mo4734w() {
            RecyclerView recyclerView = this.f4490w;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: x */
        public final int mo4735x() {
            RecyclerView recyclerView = this.f4490w;
            if (recyclerView != null) {
                return C0792v.m2770f(recyclerView);
            }
            return 0;
        }

        /* renamed from: y */
        public final int mo4736y() {
            RecyclerView recyclerView = this.f4490w;
            if (recyclerView != null) {
                return C0792v.m2772g(recyclerView);
            }
            return 0;
        }

        /* renamed from: A */
        public final int mo4685A() {
            AbstractC1350a adapter;
            RecyclerView recyclerView = this.f4490w;
            if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
                return 0;
            }
            return adapter.getItemCount();
        }

        /* renamed from: p */
        public final boolean mo4727p() {
            RecyclerView recyclerView = this.f4490w;
            if (recyclerView == null || !recyclerView.f4440j) {
                return false;
            }
            return true;
        }

        /* renamed from: q */
        public final boolean mo4728q() {
            AbstractC1375r rVar = this.f4493z;
            if (rVar == null || !rVar.f4519k) {
                return false;
            }
            return true;
        }

        /* renamed from: r */
        public final void mo4729r() {
            for (int s = mo4730s() - 1; s >= 0; s--) {
                this.f4489v.mo4895a(s);
            }
        }

        /* renamed from: s */
        public final int mo4730s() {
            C1425f fVar = this.f4489v;
            if (fVar != null) {
                return fVar.mo4894a();
            }
            return 0;
        }

        /* renamed from: t */
        public final int mo4731t() {
            RecyclerView recyclerView = this.f4490w;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: u */
        public final int mo4732u() {
            RecyclerView recyclerView = this.f4490w;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: v */
        public final int mo4733v() {
            RecyclerView recyclerView = this.f4490w;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: z */
        public final View mo4737z() {
            View focusedChild;
            RecyclerView recyclerView = this.f4490w;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f4489v.mo4905d(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public AbstractC1362i() {
            C13631 r2 = new C1403ae.AbstractC1405b() {
                /* class androidx.recyclerview.widget.RecyclerView.AbstractC1362i.C13631 */

                static {
                    Covode.recordClassIndex(1497);
                }

                @Override // androidx.recyclerview.widget.C1403ae.AbstractC1405b
                /* renamed from: a */
                public final int mo4738a() {
                    return AbstractC1362i.this.mo4731t();
                }

                @Override // androidx.recyclerview.widget.C1403ae.AbstractC1405b
                /* renamed from: b */
                public final int mo4741b() {
                    return AbstractC1362i.this.f4485J - AbstractC1362i.this.mo4733v();
                }

                @Override // androidx.recyclerview.widget.C1403ae.AbstractC1405b
                /* renamed from: a */
                public final int mo4739a(View view) {
                    return AbstractC1362i.m4431o(view) - ((C1367j) view.getLayoutParams()).leftMargin;
                }

                @Override // androidx.recyclerview.widget.C1403ae.AbstractC1405b
                /* renamed from: a */
                public final View mo4740a(int i) {
                    return AbstractC1362i.this.mo4717g(i);
                }

                @Override // androidx.recyclerview.widget.C1403ae.AbstractC1405b
                /* renamed from: b */
                public final int mo4742b(View view) {
                    return AbstractC1362i.m4433q(view) + ((C1367j) view.getLayoutParams()).rightMargin;
                }
            };
            this.f4487a = r2;
            C13642 r1 = new C1403ae.AbstractC1405b() {
                /* class androidx.recyclerview.widget.RecyclerView.AbstractC1362i.C13642 */

                static {
                    Covode.recordClassIndex(1498);
                }

                @Override // androidx.recyclerview.widget.C1403ae.AbstractC1405b
                /* renamed from: a */
                public final int mo4738a() {
                    return AbstractC1362i.this.mo4732u();
                }

                @Override // androidx.recyclerview.widget.C1403ae.AbstractC1405b
                /* renamed from: b */
                public final int mo4741b() {
                    return AbstractC1362i.this.f4486K - AbstractC1362i.this.mo4734w();
                }

                @Override // androidx.recyclerview.widget.C1403ae.AbstractC1405b
                /* renamed from: a */
                public final int mo4739a(View view) {
                    return AbstractC1362i.m4432p(view) - ((C1367j) view.getLayoutParams()).topMargin;
                }

                @Override // androidx.recyclerview.widget.C1403ae.AbstractC1405b
                /* renamed from: a */
                public final View mo4740a(int i) {
                    return AbstractC1362i.this.mo4717g(i);
                }

                @Override // androidx.recyclerview.widget.C1403ae.AbstractC1405b
                /* renamed from: b */
                public final int mo4742b(View view) {
                    return AbstractC1362i.m4434r(view) + ((C1367j) view.getLayoutParams()).bottomMargin;
                }
            };
            this.f4488b = r1;
            this.f4491x = new C1403ae(r2);
            this.f4492y = new C1403ae(r1);
        }

        /* renamed from: b */
        private void mo4356b(int i) {
            mo4717g(i);
            mo4360d(i);
        }

        /* renamed from: d */
        private void mo4360d(int i) {
            this.f4489v.mo4904d(i);
        }

        /* renamed from: a_ */
        public final void mo4701a_(View view) {
            m4419a(view, -1, true);
        }

        /* renamed from: b_ */
        public final void mo4708b_(View view) {
            m4419a(view, 0, true);
        }

        /* renamed from: c */
        public final void mo4710c(View view) {
            m4419a(view, -1, false);
        }

        /* renamed from: i */
        public final void mo4722i(View view) {
            m4421b(view, -1);
        }

        /* renamed from: a */
        private void mo4318a(int i) {
            if (mo4717g(i) != null) {
                this.f4489v.mo4895a(i);
            }
        }

        /* renamed from: e */
        public static int m4426e(View view) {
            return ((C1367j) view.getLayoutParams()).f4500c.getLayoutPosition();
        }

        /* renamed from: f */
        public static int m4427f(View view) {
            return RecyclerView.m4275c(view).getItemViewType();
        }

        /* renamed from: k */
        public static void m4428k(View view) {
            ViewHolder c = RecyclerView.m4275c(view);
            c.stopIgnoring();
            c.resetInternal();
            c.addFlags(4);
        }

        /* renamed from: o */
        public static int m4431o(View view) {
            return view.getLeft() - m4437u(view);
        }

        /* renamed from: p */
        public static int m4432p(View view) {
            return view.getTop() - m4435s(view);
        }

        /* renamed from: q */
        public static int m4433q(View view) {
            return view.getRight() + m4438v(view);
        }

        /* renamed from: r */
        public static int m4434r(View view) {
            return view.getBottom() + m4436t(view);
        }

        /* renamed from: s */
        public static int m4435s(View view) {
            return ((C1367j) view.getLayoutParams()).f4501d.top;
        }

        /* renamed from: t */
        public static int m4436t(View view) {
            return ((C1367j) view.getLayoutParams()).f4501d.bottom;
        }

        /* renamed from: u */
        public static int m4437u(View view) {
            return ((C1367j) view.getLayoutParams()).f4501d.left;
        }

        /* renamed from: v */
        public static int m4438v(View view) {
            return ((C1367j) view.getLayoutParams()).f4501d.right;
        }

        /* renamed from: g */
        public final View mo4717g(int i) {
            C1425f fVar = this.f4489v;
            if (fVar != null) {
                return fVar.mo4900b(i);
            }
            return null;
        }

        /* renamed from: h */
        public final void mo4720h(View view) {
            int c = this.f4489v.mo4902c(view);
            if (c >= 0) {
                mo4360d(c);
            }
        }

        /* renamed from: m */
        public static int m4429m(View view) {
            Rect rect = ((C1367j) view.getLayoutParams()).f4501d;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: n */
        public static int m4430n(View view) {
            Rect rect = ((C1367j) view.getLayoutParams()).f4501d;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: c */
        public final void mo4711c(C1372o oVar) {
            for (int s = mo4730s() - 1; s >= 0; s--) {
                if (!RecyclerView.m4275c(mo4717g(s)).shouldIgnore()) {
                    mo4687a(s, oVar);
                }
            }
        }

        /* renamed from: d */
        public final void mo4715d(View view) {
            C1425f fVar = this.f4489v;
            int a = fVar.f4688a.mo4539a(view);
            if (a >= 0) {
                if (fVar.f4689b.mo4911d(a)) {
                    fVar.mo4901b(view);
                }
                fVar.f4688a.mo4540a(a);
            }
        }

        /* renamed from: g */
        public final View mo4718g(View view) {
            View b;
            RecyclerView recyclerView = this.f4490w;
            if (recyclerView == null || (b = recyclerView.mo4411b(view)) == null || this.f4489v.mo4905d(b)) {
                return null;
            }
            return b;
        }

        /* renamed from: h */
        public void mo4719h(int i) {
            RecyclerView recyclerView = this.f4490w;
            if (recyclerView != null) {
                int a = recyclerView.f4438h.mo4894a();
                for (int i2 = 0; i2 < a; i2++) {
                    recyclerView.f4438h.mo4900b(i2).offsetLeftAndRight(i);
                }
            }
        }

        /* renamed from: i */
        public void mo4721i(int i) {
            RecyclerView recyclerView = this.f4490w;
            if (recyclerView != null) {
                int a = recyclerView.f4438h.mo4894a();
                for (int i2 = 0; i2 < a; i2++) {
                    recyclerView.f4438h.mo4900b(i2).offsetTopAndBottom(i);
                }
            }
        }

        /* renamed from: c */
        public View mo4358c(int i) {
            int s = mo4730s();
            for (int i2 = 0; i2 < s; i2++) {
                View g = mo4717g(i2);
                ViewHolder c = RecyclerView.m4275c(g);
                if (c != null && c.getLayoutPosition() == i && !c.shouldIgnore() && (this.f4490w.f4386G.f4535g || !c.isRemoved())) {
                    return g;
                }
            }
            return null;
        }

        /* renamed from: j */
        public final void mo4724j(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f4490w;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f4490w.mo4394a());
            }
            ViewHolder c = RecyclerView.m4275c(view);
            c.addFlags(128);
            this.f4490w.f4439i.mo4882e(c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo4716d(RecyclerView recyclerView) {
            mo4700a_(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: l */
        public final void mo4725l(View view) {
            C1367j jVar = (C1367j) view.getLayoutParams();
            Rect f = this.f4490w.mo4450f(view);
            int i = f.left + f.right + 0;
            int i2 = f.top + f.bottom + 0;
            int a = m4414a(this.f4485J, this.f4483H, mo4731t() + mo4733v() + jVar.leftMargin + jVar.rightMargin + i, jVar.width, mo4366f());
            int a2 = m4414a(this.f4486K, this.f4484I, mo4732u() + mo4734w() + jVar.topMargin + jVar.bottomMargin + i2, jVar.height, mo4368g());
            if (mo4707b(view, a, a2, jVar)) {
                view.measure(a, a2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo4704b(C1372o oVar) {
            int size = oVar.f4504a.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = oVar.f4504a.get(i).itemView;
                ViewHolder c = RecyclerView.m4275c(view);
                if (!c.shouldIgnore()) {
                    c.setIsRecyclable(false);
                    if (c.isTmpDetached()) {
                        this.f4490w.removeDetachedView(view, false);
                    }
                    if (this.f4490w.f4382C != null) {
                        this.f4490w.f4382C.mo4670c(c);
                    }
                    c.setIsRecyclable(true);
                    oVar.mo4764b(view);
                }
            }
            oVar.f4504a.clear();
            if (oVar.f4505b != null) {
                oVar.f4505b.clear();
            }
            if (size > 0) {
                this.f4490w.invalidate();
            }
        }

        /* renamed from: d */
        public final void mo4714d(int i, int i2) {
            this.f4490w.setMeasuredDimension(i, i2);
        }

        /* renamed from: b */
        private void m4421b(View view, int i) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewHolder c = RecyclerView.m4275c(view);
            if (c.isRemoved()) {
                this.f4490w.f4439i.mo4879c(c);
            } else {
                this.f4490w.f4439i.mo4881d(c);
            }
            this.f4489v.mo4897a(view, i, layoutParams, c.isRemoved());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a_ */
        public final void mo4700a_(int i, int i2) {
            this.f4485J = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f4483H = mode;
            if (mode == 0 && !RecyclerView.f4377b) {
                this.f4485J = 0;
            }
            this.f4486K = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f4484I = mode2;
            if (mode2 == 0 && !RecyclerView.f4377b) {
                this.f4486K = 0;
            }
        }

        /* renamed from: c */
        private int[] m4423c(View view, Rect rect) {
            int[] iArr = new int[2];
            int t = mo4731t();
            int u = mo4732u();
            int v = this.f4485J - mo4733v();
            int w = this.f4486K - mo4734w();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - t;
            int min = Math.min(0, i);
            int i2 = top - u;
            int min2 = Math.min(0, i2);
            int i3 = width - v;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - w);
            if (C0792v.m2768e(this.f4490w) != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: a */
        private void mo4347a(int i, int i2) {
            View g = mo4717g(i);
            if (g != null) {
                mo4356b(i);
                m4421b(g, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f4490w.toString());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo4709c(int i, int i2) {
            int s = mo4730s();
            if (s == 0) {
                this.f4490w.mo4449e(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < s; i7++) {
                View g = mo4717g(i7);
                Rect rect = this.f4490w.f4442l;
                RecyclerView.m4262a(g, rect);
                if (rect.left < i5) {
                    i5 = rect.left;
                }
                if (rect.right > i3) {
                    i3 = rect.right;
                }
                if (rect.top < i6) {
                    i6 = rect.top;
                }
                if (rect.bottom > i4) {
                    i4 = rect.bottom;
                }
            }
            this.f4490w.f4442l.set(i5, i6, i3, i4);
            mo4319a(this.f4490w.f4442l, i, i2);
        }

        /* renamed from: b */
        public final void mo4703b(View view, Rect rect) {
            RecyclerView recyclerView = this.f4490w;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.mo4450f(view));
            }
        }

        /* renamed from: a */
        public static int m4413a(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i2, i3));
            }
            if (mode != 1073741824) {
                return Math.max(i2, i3);
            }
            return size;
        }

        /* renamed from: d */
        private boolean m4425d(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int t = mo4731t();
            int u = mo4732u();
            int v = this.f4485J - mo4733v();
            int w = this.f4486K - mo4734w();
            Rect rect = this.f4490w.f4442l;
            RecyclerView.m4262a(focusedChild, rect);
            if (rect.left - i >= v || rect.right - i <= t || rect.top - i2 >= w || rect.bottom - i2 <= u) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        private static boolean m4422b(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode == 1073741824 && size == i) {
                    return true;
                }
                return false;
            } else if (size >= i) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: a */
        private void m4419a(View view, int i, boolean z) {
            ViewHolder c = RecyclerView.m4275c(view);
            if (z || c.isRemoved()) {
                this.f4490w.f4439i.mo4879c(c);
            } else {
                this.f4490w.f4439i.mo4881d(c);
            }
            C1367j jVar = (C1367j) view.getLayoutParams();
            if (c.wasReturnedFromScrap() || c.isScrap()) {
                if (c.isScrap()) {
                    c.unScrap();
                } else {
                    c.clearReturnedFromScrapFlag();
                }
                this.f4489v.mo4897a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f4490w) {
                int c2 = this.f4489v.mo4902c(view);
                if (i == -1) {
                    i = this.f4489v.mo4894a();
                }
                if (c2 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f4490w.indexOfChild(view) + this.f4490w.mo4394a());
                } else if (c2 != i) {
                    this.f4490w.f4445o.mo4347a(c2, i);
                }
            } else {
                this.f4489v.mo4898a(view, i, false);
                jVar.f4502e = true;
                AbstractC1375r rVar = this.f4493z;
                if (rVar != null && rVar.f4519k) {
                    this.f4493z.mo4776a(view);
                }
            }
            if (jVar.f4503f) {
                c.itemView.invalidate();
                jVar.f4503f = false;
            }
        }

        /* renamed from: a */
        public static C1366b m4415a(Context context, AttributeSet attributeSet, int i, int i2) {
            C1366b bVar = new C1366b();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948, 16842987, 16842993, R.attr.tu, R.attr.tv, R.attr.tw, R.attr.tx, R.attr.ty, R.attr.z_, R.attr.a9r, R.attr.acx, R.attr.aev}, i, i2);
            bVar.f4496a = obtainStyledAttributes.getInt(0, 1);
            bVar.f4497b = obtainStyledAttributes.getInt(10, 1);
            bVar.f4498c = obtainStyledAttributes.getBoolean(9, false);
            bVar.f4499d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
            if (r5 != 1073741824) goto L_0x002d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m4414a(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r0 = 0
                int r4 = java.lang.Math.max(r0, r4)
                r3 = -2
                r2 = -1
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x0017
                if (r7 < 0) goto L_0x0027
            L_0x0010:
                r5 = 1073741824(0x40000000, float:2.0)
            L_0x0012:
                int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r0
            L_0x0017:
                if (r7 < 0) goto L_0x001a
                goto L_0x0010
            L_0x001a:
                if (r7 != r2) goto L_0x001e
            L_0x001c:
                r7 = r4
                goto L_0x0012
            L_0x001e:
                if (r7 != r3) goto L_0x002d
                if (r5 == r1) goto L_0x0024
                if (r5 != r0) goto L_0x0034
            L_0x0024:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x001c
            L_0x0027:
                if (r7 != r2) goto L_0x0030
                if (r5 == r1) goto L_0x001c
                if (r5 == r0) goto L_0x001c
            L_0x002d:
                r5 = 0
                r7 = 0
                goto L_0x0012
            L_0x0030:
                if (r7 != r3) goto L_0x002d
                r7 = 0
                goto L_0x0035
            L_0x0034:
                r7 = r4
            L_0x0035:
                r5 = 0
                goto L_0x0012
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC1362i.m4414a(int, int, int, int, boolean):int");
        }

        /* renamed from: a */
        public static void m4418a(View view, int i, int i2, int i3, int i4) {
            Rect rect = ((C1367j) view.getLayoutParams()).f4501d;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        /* renamed from: b */
        public void mo4702b(View view, int i, int i2, int i3, int i4) {
            C1367j jVar = (C1367j) view.getLayoutParams();
            Rect rect = jVar.f4501d;
            view.layout(i + rect.left + jVar.leftMargin, i2 + rect.top + jVar.topMargin, (i3 - rect.right) - jVar.rightMargin, (i4 - rect.bottom) - jVar.bottomMargin);
        }
    }

    public AbstractC1350a getAdapter() {
        return this.f4444n;
    }

    public boolean getClipToPadding() {
        return this.f4440j;
    }

    public C1496z getCompatAccessibilityDelegate() {
        return this.f4390K;
    }

    public C1355e getEdgeEffectFactory() {
        return this.f4414af;
    }

    public AbstractC1356f getItemAnimator() {
        return this.f4382C;
    }

    public AbstractC1362i getLayoutManager() {
        return this.f4445o;
    }

    public int getMaxFlingVelocity() {
        return this.f4429au;
    }

    public int getMinFlingVelocity() {
        return this.f4428at;
    }

    public AbstractC1369l getOnFlingListener() {
        return this.f4427as;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4432ax;
    }

    public int getScrollState() {
        return this.f4419ak;
    }

    public boolean isAttachedToWindow() {
        return this.f4449s;
    }

    public final boolean isLayoutSuppressed() {
        return this.f4454x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo4394a() {
        return " " + super.toString() + ", adapter:" + this.f4444n + ", layout:" + this.f4445o + ", context:" + getContext();
    }

    /* renamed from: a */
    public void mo4401a(AbstractC1350a aVar, boolean z) {
        setLayoutFrozen(false);
        m4265a(aVar, true, z);
        mo4426c(true);
        requestLayout();
    }

    /* renamed from: a */
    private void m4265a(AbstractC1350a aVar, boolean z, boolean z2) {
        AbstractC1350a aVar2 = this.f4444n;
        if (aVar2 != null) {
            aVar2.unregisterAdapterDataObserver(this.f4393S);
            this.f4444n.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            mo4412b();
        }
        this.f4437g.mo4837a();
        AbstractC1350a aVar3 = this.f4444n;
        this.f4444n = aVar;
        if (aVar != null) {
            aVar.registerAdapterDataObserver(this.f4393S);
            aVar.onAttachedToRecyclerView(this);
        }
        AbstractC1362i iVar = this.f4445o;
        if (iVar != null) {
            iVar.mo4692a(aVar3, this.f4444n);
        }
        this.f4435e.mo4761a(aVar3, this.f4444n, z);
        this.f4386G.f4534f = true;
    }

    /* renamed from: a */
    public final void mo4403a(AbstractC1368k kVar) {
        if (this.f4456z == null) {
            this.f4456z = new ArrayList();
        }
        this.f4456z.add(kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4399a(ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        boolean z = view.getParent() == this;
        this.f4435e.mo4765b(mo4393a(view));
        if (viewHolder.isTmpDetached()) {
            this.f4438h.mo4897a(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f4438h.mo4898a(view, -1, true);
        } else {
            C1425f fVar = this.f4438h;
            int a = fVar.f4688a.mo4539a(view);
            if (a >= 0) {
                fVar.f4689b.mo4907a(a);
                fVar.mo4896a(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(String.valueOf(view)));
        }
    }

    /* renamed from: a */
    public final void mo4402a(AbstractC1361h hVar) {
        AbstractC1362i iVar = this.f4445o;
        if (iVar != null) {
            iVar.mo4355a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f4448r.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f4448r.add(hVar);
        m4254J();
        requestLayout();
    }

    /* renamed from: a */
    public final void mo4405a(AbstractC1371n nVar) {
        if (this.f4434az == null) {
            this.f4434az = new ArrayList();
        }
        this.f4434az.add(nVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4398a(int i, int i2, int[] iArr) {
        mo4476h();
        mo4482j();
        C0654g.m2391a("RV Scroll");
        m4266a(this.f4386G);
        int a = i != 0 ? this.f4445o.mo4312a(i, this.f4435e, this.f4386G) : 0;
        int b = i2 != 0 ? this.f4445o.mo4331b(i2, this.f4435e, this.f4386G) : 0;
        C0654g.m2390a();
        int a2 = this.f4438h.mo4894a();
        for (int i3 = 0; i3 < a2; i3++) {
            View b2 = this.f4438h.mo4900b(i3);
            ViewHolder a3 = mo4393a(b2);
            if (!(a3 == null || a3.mShadowingHolder == null)) {
                View view = a3.mShadowingHolder.itemView;
                int left = b2.getLeft();
                int top = b2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        mo4419b(true);
        mo4406a(false);
        if (iArr != null) {
            iArr[0] = a;
            iArr[1] = b;
        }
    }

    /* renamed from: a */
    private boolean m4271a(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        mo4455g();
        if (this.f4444n != null) {
            int[] iArr = this.f4391L;
            iArr[0] = 0;
            iArr[1] = 0;
            mo4398a(i, i2, iArr);
            int[] iArr2 = this.f4391L;
            i5 = iArr2[0];
            i4 = iArr2[1];
            i6 = i - i5;
            i7 = i2 - i4;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.f4448r.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f4391L;
        iArr3[0] = 0;
        iArr3[1] = 0;
        mo4396a(i5, i4, i6, i7, this.f4402aE, i3, iArr3);
        int[] iArr4 = this.f4391L;
        int i8 = i6 - iArr4[0];
        int i9 = i7 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i10 = this.f4424ap;
        int[] iArr5 = this.f4402aE;
        this.f4424ap = i10 - iArr5[0];
        this.f4425aq -= iArr5[1];
        int[] iArr6 = this.f4403aF;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C0779i.m2706a(motionEvent)) {
                m4260a(motionEvent.getX(), (float) i8, motionEvent.getY(), (float) i9);
            }
            mo4424c(i, i2);
        }
        if (!(i5 == 0 && i4 == 0)) {
            mo4453f(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i5 == 0 && i4 == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4406a(boolean z) {
        if (this.f4397W <= 0) {
            this.f4397W = 1;
        }
        if (!z && !this.f4454x) {
            this.f4453w = false;
        }
        if (this.f4397W == 1) {
            if (z && this.f4453w && !this.f4454x && this.f4445o != null && this.f4444n != null) {
                m4247C();
            }
            if (!this.f4454x) {
                this.f4453w = false;
            }
        }
        this.f4397W--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4397a(int i, int i2, boolean z) {
        AbstractC1362i iVar = this.f4445o;
        if (iVar != null && !this.f4454x) {
            boolean f = iVar.mo4366f();
            int i3 = 0;
            if (!f) {
                i = 0;
            }
            if (!this.f4445o.mo4368g()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (z) {
                    if (i != 0) {
                        i3 = 1;
                    }
                    if (i2 != 0) {
                        i3 |= 2;
                    }
                    m4282h(i3, 1);
                }
                this.f4383D.mo4787a(i, i2, Integer.MIN_VALUE, null);
            }
        }
    }

    /* renamed from: b */
    public boolean mo4420b(int i, int i2) {
        int i3 = i2;
        AbstractC1362i iVar = this.f4445o;
        if (iVar == null || this.f4454x) {
            return false;
        }
        boolean f = iVar.mo4366f();
        boolean g = this.f4445o.mo4368g();
        if (!f || Math.abs(i) < this.f4428at) {
            i = 0;
        }
        if (!g || Math.abs(i3) < this.f4428at) {
            i3 = 0;
        }
        if (i == 0 && i3 == 0) {
            return false;
        }
        float f2 = (float) i;
        float f3 = (float) i3;
        if (!dispatchNestedPreFling(f2, f3)) {
            boolean z = f || g;
            dispatchNestedFling(f2, f3, z);
            AbstractC1369l lVar = this.f4427as;
            if (lVar != null && lVar.mo4749a(i, i3)) {
                return true;
            }
            if (z) {
                if (g) {
                    boolean z2 = f ? 1 : 0;
                    char c = f ? 1 : 0;
                    f = z2 | true;
                }
                int i4 = f ? 1 : 0;
                int i5 = f ? 1 : 0;
                int i6 = f ? 1 : 0;
                m4282h(i4, 1);
                int i7 = this.f4429au;
                int max = Math.max(-i7, Math.min(i, i7));
                int i8 = this.f4429au;
                int max2 = Math.max(-i8, Math.min(i3, i8));
                RunnableC1380u uVar = this.f4383D;
                RecyclerView.this.setScrollState(2);
                uVar.f4547b = 0;
                uVar.f4546a = 0;
                Interpolator interpolator = uVar.f4549d;
                Interpolator interpolator2 = f4371N;
                if (interpolator != interpolator2) {
                    uVar.f4549d = interpolator2;
                    uVar.f4548c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
                }
                uVar.f4548c.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                uVar.mo4786a();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo4404a(AbstractC1370m mVar) {
        this.f4395U.add(mVar);
    }

    /* renamed from: a */
    private boolean m4272a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f4395U.size();
        for (int i = 0; i < size; i++) {
            AbstractC1370m mVar = this.f4395U.get(i);
            if (mVar.mo4751a(this, motionEvent) && action != 3) {
                this.f4396V = mVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m4266a(C1378s sVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f4383D.f4548c;
            sVar.f4543o = overScroller.getFinalX() - overScroller.getCurrX();
            sVar.f4544p = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        sVar.f4543o = 0;
        sVar.f4544p = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4400a(ViewHolder viewHolder, AbstractC1356f.C1359c cVar) {
        viewHolder.setFlags(0, 8192);
        if (this.f4386G.f4536h && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            this.f4439i.mo4873a(m4279e(viewHolder), viewHolder);
        }
        this.f4439i.mo4874a(viewHolder, cVar);
    }

    /* renamed from: a */
    private void m4270a(int[] iArr) {
        int a = this.f4438h.mo4894a();
        if (a == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < a; i3++) {
            ViewHolder c = m4275c(this.f4438h.mo4900b(i3));
            if (!c.shouldIgnore()) {
                int layoutPosition = c.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo4421b(ViewHolder viewHolder) {
        AbstractC1356f fVar = this.f4382C;
        return fVar == null || fVar.mo4666a(viewHolder, viewHolder.getUnmodifiedPayloads());
    }

    /* renamed from: a */
    public final ViewHolder mo4393a(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m4275c(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: a */
    public final ViewHolder mo4392a(int i, boolean z) {
        int b = this.f4438h.mo4899b();
        ViewHolder viewHolder = null;
        for (int i2 = 0; i2 < b; i2++) {
            ViewHolder c = m4275c(this.f4438h.mo4903c(i2));
            if (c != null && !c.isRemoved()) {
                if (z) {
                    if (c.mPosition != i) {
                        continue;
                    }
                } else if (c.getLayoutPosition() != i) {
                    continue;
                }
                if (!this.f4438h.mo4905d(c.itemView)) {
                    return c;
                }
                viewHolder = c;
            }
        }
        return viewHolder;
    }

    /* renamed from: a */
    public final View mo4391a(float f, float f2) {
        for (int a = this.f4438h.mo4894a() - 1; a >= 0; a--) {
            View b = this.f4438h.mo4900b(a);
            float translationX = b.getTranslationX();
            float translationY = b.getTranslationY();
            if (f >= ((float) b.getLeft()) + translationX && f <= ((float) b.getRight()) + translationX && f2 >= ((float) b.getTop()) + translationY && f2 <= ((float) b.getBottom()) + translationY) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public final class C1372o {

        /* renamed from: a */
        final ArrayList<ViewHolder> f4504a;

        /* renamed from: b */
        ArrayList<ViewHolder> f4505b = null;

        /* renamed from: c */
        final ArrayList<ViewHolder> f4506c = new ArrayList<>();

        /* renamed from: d */
        public final List<ViewHolder> f4507d;

        /* renamed from: e */
        int f4508e;

        /* renamed from: f */
        int f4509f;

        /* renamed from: g */
        RecycledViewPool f4510g;

        /* renamed from: h */
        public AbstractC1379t f4511h;

        static {
            Covode.recordClassIndex(1506);
        }

        /* renamed from: a */
        public final void mo4758a(View view, int i) {
            C1367j jVar;
            ViewHolder c = RecyclerView.m4275c(view);
            if (c != null) {
                int b = RecyclerView.this.f4437g.mo4840b(i);
                if (b < 0 || b >= RecyclerView.this.f4444n.getItemCount()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + b + ").state:" + RecyclerView.this.f4386G.mo4782a() + RecyclerView.this.mo4394a());
                }
                m4558a(c, b, i, Long.MAX_VALUE);
                ViewGroup.LayoutParams layoutParams = c.itemView.getLayoutParams();
                if (layoutParams == null) {
                    jVar = (C1367j) RecyclerView.this.generateDefaultLayoutParams();
                    c.itemView.setLayoutParams(jVar);
                } else if (!RecyclerView.this.checkLayoutParams(layoutParams)) {
                    jVar = (C1367j) RecyclerView.this.generateLayoutParams(layoutParams);
                    c.itemView.setLayoutParams(jVar);
                } else {
                    jVar = (C1367j) layoutParams;
                }
                boolean z = true;
                jVar.f4502e = true;
                jVar.f4500c = c;
                if (c.itemView.getParent() != null) {
                    z = false;
                }
                jVar.f4503f = z;
                return;
            }
            throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + RecyclerView.this.mo4394a());
        }

        /* renamed from: a */
        public final int mo4755a(int i) {
            if (i < 0 || i >= RecyclerView.this.f4386G.mo4782a()) {
                throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.f4386G.mo4782a() + RecyclerView.this.mo4394a());
            } else if (!RecyclerView.this.f4386G.f4535g) {
                return i;
            } else {
                return RecyclerView.this.f4437g.mo4840b(i);
            }
        }

        /* renamed from: a */
        public final void mo4757a(View view) {
            ViewHolder c = RecyclerView.m4275c(view);
            if (c.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (c.isScrap()) {
                c.unScrap();
            } else if (c.wasReturnedFromScrap()) {
                c.clearReturnedFromScrapFlag();
            }
            mo4759a(c);
            if (RecyclerView.this.f4382C != null && !c.isRecyclable()) {
                RecyclerView.this.f4382C.mo4670c(c);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4759a(ViewHolder viewHolder) {
            boolean z = false;
            boolean z2 = true;
            if (viewHolder.isScrap() || viewHolder.itemView.getParent() != null) {
                StringBuilder append = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:").append(viewHolder.isScrap()).append(" isAttached:");
                if (viewHolder.itemView.getParent() != null) {
                    z = true;
                }
                throw new IllegalArgumentException(append.append(z).append(RecyclerView.this.mo4394a()).toString());
            } else if (viewHolder.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + viewHolder + RecyclerView.this.mo4394a());
            } else if (!viewHolder.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = viewHolder.doesTransientStatePreventRecycling();
                if ((RecyclerView.this.f4444n != null && doesTransientStatePreventRecycling && RecyclerView.this.f4444n.onFailedToRecycleView(viewHolder)) || viewHolder.isRecyclable()) {
                    if (this.f4509f <= 0 || viewHolder.hasAnyOfTheFlags(526)) {
                        mo4760a(viewHolder, true);
                        z = false;
                        RecyclerView.this.f4439i.mo4882e(viewHolder);
                        if (!z && !z2 && doesTransientStatePreventRecycling) {
                            viewHolder.mBindingAdapter = null;
                            viewHolder.mOwnerRecyclerView = null;
                            return;
                        }
                        return;
                    }
                    int size = this.f4506c.size();
                    if (size >= this.f4509f && size > 0) {
                        mo4770d(0);
                        size--;
                    }
                    if (RecyclerView.f4379d && size > 0 && !RecyclerView.this.f4385F.mo4971a(viewHolder.mPosition)) {
                        int i = size - 1;
                        while (i >= 0) {
                            if (!RecyclerView.this.f4385F.mo4971a(this.f4506c.get(i).mPosition)) {
                                break;
                            }
                            i--;
                        }
                        size = i + 1;
                    }
                    this.f4506c.add(size, viewHolder);
                    z = true;
                }
                z2 = false;
                RecyclerView.this.f4439i.mo4882e(viewHolder);
                if (!z) {
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.mo4394a());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4760a(ViewHolder viewHolder, boolean z) {
            RecyclerView.m4276c(viewHolder);
            View view = viewHolder.itemView;
            if (RecyclerView.this.f4390K != null) {
                C1496z.C1497a aVar = RecyclerView.this.f4390K.f4939c;
                C0792v.m2747a(view, aVar instanceof C1496z.C1497a ? aVar.mo5035c(view) : null);
            }
            if (z) {
                m4562e(viewHolder);
            }
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
            mo4767c().putRecycledView(viewHolder);
        }

        /* renamed from: a */
        public final void mo4756a() {
            this.f4504a.clear();
            m4563g();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final RecycledViewPool mo4767c() {
            if (this.f4510g == null) {
                this.f4510g = new RecycledViewPool();
            }
            return this.f4510g;
        }

        /* renamed from: g */
        private void m4563g() {
            for (int size = this.f4506c.size() - 1; size >= 0; size--) {
                mo4770d(size);
            }
            this.f4506c.clear();
            if (RecyclerView.f4379d) {
                RecyclerView.this.f4385F.mo4969a();
            }
        }

        /* renamed from: b */
        public final void mo4763b() {
            int i;
            if (RecyclerView.this.f4445o != null) {
                i = RecyclerView.this.f4445o.f4481F;
            } else {
                i = 0;
            }
            this.f4509f = this.f4508e + i;
            for (int size = this.f4506c.size() - 1; size >= 0 && this.f4506c.size() > this.f4509f; size--) {
                mo4770d(size);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo4769d() {
            int size = this.f4506c.size();
            for (int i = 0; i < size; i++) {
                ViewHolder viewHolder = this.f4506c.get(i);
                if (viewHolder != null) {
                    viewHolder.addFlags(6);
                    viewHolder.addChangePayload(null);
                }
            }
            if (RecyclerView.this.f4444n == null || !RecyclerView.this.f4444n.mHasStableIds) {
                m4563g();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final void mo4772f() {
            int size = this.f4506c.size();
            for (int i = 0; i < size; i++) {
                C1367j jVar = (C1367j) this.f4506c.get(i).itemView.getLayoutParams();
                if (jVar != null) {
                    jVar.f4502e = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final void mo4771e() {
            int size = this.f4506c.size();
            for (int i = 0; i < size; i++) {
                this.f4506c.get(i).clearOldPosition();
            }
            int size2 = this.f4504a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f4504a.get(i2).clearOldPosition();
            }
            ArrayList<ViewHolder> arrayList = this.f4505b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f4505b.get(i3).clearOldPosition();
                }
            }
        }

        /* renamed from: b */
        public final View mo4762b(int i) {
            return mo4766c(i);
        }

        /* renamed from: d */
        private void m4560d(ViewHolder viewHolder) {
            if (viewHolder.itemView instanceof ViewGroup) {
                m4557a((ViewGroup) viewHolder.itemView, false);
            }
        }

        /* renamed from: c */
        public final View mo4766c(int i) {
            return m4556a(this, i, Long.MAX_VALUE).itemView;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo4764b(View view) {
            ViewHolder c = RecyclerView.m4275c(view);
            c.mScrapContainer = null;
            c.mInChangeScrap = false;
            c.clearReturnedFromScrapFlag();
            mo4759a(c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo4770d(int i) {
            mo4760a(this.f4506c.get(i), true);
            this.f4506c.remove(i);
        }

        public C1372o() {
            ArrayList<ViewHolder> arrayList = new ArrayList<>();
            this.f4504a = arrayList;
            this.f4507d = Collections.unmodifiableList(arrayList);
            this.f4508e = 2;
            this.f4509f = 2;
        }

        /* renamed from: e */
        private void m4562e(ViewHolder viewHolder) {
            int size = RecyclerView.this.f4447q.size();
            for (int i = 0; i < size; i++) {
                RecyclerView.this.f4447q.get(i);
            }
            if (RecyclerView.this.f4444n != null) {
                RecyclerView.this.f4444n.onViewRecycled(viewHolder);
            }
            if (RecyclerView.this.f4386G != null) {
                RecyclerView.this.f4439i.mo4882e(viewHolder);
            }
        }

        /* renamed from: c */
        private boolean m4559c(ViewHolder viewHolder) {
            if (viewHolder.isRemoved()) {
                return RecyclerView.this.f4386G.f4535g;
            }
            if (viewHolder.mPosition < 0 || viewHolder.mPosition >= RecyclerView.this.f4444n.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + viewHolder + RecyclerView.this.mo4394a());
            } else if (!RecyclerView.this.f4386G.f4535g && RecyclerView.this.f4444n.getItemViewType(viewHolder.mPosition) != viewHolder.getItemViewType()) {
                return false;
            } else {
                if (!RecyclerView.this.f4444n.mHasStableIds || viewHolder.getItemId() == RecyclerView.this.f4444n.getItemId(viewHolder.mPosition)) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: e */
        private ViewHolder m4561e(int i) {
            int size;
            int a;
            ArrayList<ViewHolder> arrayList = this.f4505b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                for (int i2 = 0; i2 < size; i2++) {
                    ViewHolder viewHolder = this.f4505b.get(i2);
                    if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i) {
                        viewHolder.addFlags(32);
                        return viewHolder;
                    }
                }
                if (RecyclerView.this.f4444n.mHasStableIds && (a = RecyclerView.this.f4437g.mo4835a(i, 0)) > 0 && a < RecyclerView.this.f4444n.getItemCount()) {
                    long itemId = RecyclerView.this.f4444n.getItemId(a);
                    for (int i3 = 0; i3 < size; i3++) {
                        ViewHolder viewHolder2 = this.f4505b.get(i3);
                        if (!viewHolder2.wasReturnedFromScrap() && viewHolder2.getItemId() == itemId) {
                            viewHolder2.addFlags(32);
                            return viewHolder2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo4765b(ViewHolder viewHolder) {
            if (viewHolder.mInChangeScrap) {
                this.f4505b.remove(viewHolder);
            } else {
                this.f4504a.remove(viewHolder);
            }
            viewHolder.mScrapContainer = null;
            viewHolder.mInChangeScrap = false;
            viewHolder.clearReturnedFromScrapFlag();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo4768c(View view) {
            ViewHolder c = RecyclerView.m4275c(view);
            if (!c.hasAnyOfTheFlags(12) && c.isUpdated() && !RecyclerView.this.mo4421b(c)) {
                if (this.f4505b == null) {
                    this.f4505b = new ArrayList<>();
                }
                c.setScrapContainer(this, true);
                this.f4505b.add(c);
            } else if (!c.isInvalid() || c.isRemoved() || RecyclerView.this.f4444n.mHasStableIds) {
                c.setScrapContainer(this, false);
                this.f4504a.add(c);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.mo4394a());
            }
        }

        /* renamed from: a */
        private void m4557a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m4557a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: a */
        private ViewHolder m4553a(int i, boolean z) {
            int size = this.f4504a.size();
            for (int i2 = 0; i2 < size; i2++) {
                ViewHolder viewHolder = this.f4504a.get(i2);
                if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i && !viewHolder.isInvalid() && (RecyclerView.this.f4386G.f4535g || !viewHolder.isRemoved())) {
                    viewHolder.addFlags(32);
                    return viewHolder;
                }
            }
            if (!z) {
                C1425f fVar = RecyclerView.this.f4438h;
                int size2 = fVar.f4690c.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    View view = fVar.f4690c.get(i3);
                    ViewHolder b = fVar.f4688a.mo4544b(view);
                    if (b.getLayoutPosition() != i || b.isInvalid() || b.isRemoved()) {
                        i3++;
                    } else if (view != null) {
                        ViewHolder c = RecyclerView.m4275c(view);
                        C1425f fVar2 = RecyclerView.this.f4438h;
                        int a = fVar2.f4688a.mo4539a(view);
                        if (a < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(String.valueOf(view)));
                        } else if (fVar2.f4689b.mo4910c(a)) {
                            fVar2.f4689b.mo4909b(a);
                            fVar2.mo4901b(view);
                            int c2 = RecyclerView.this.f4438h.mo4902c(view);
                            if (c2 != -1) {
                                RecyclerView.this.f4438h.mo4904d(c2);
                                mo4768c(view);
                                c.addFlags(8224);
                                return c;
                            }
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + c + RecyclerView.this.mo4394a());
                        } else {
                            throw new RuntimeException("trying to unhide a view that was not hidden".concat(String.valueOf(view)));
                        }
                    }
                }
            }
            int size3 = this.f4506c.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ViewHolder viewHolder2 = this.f4506c.get(i4);
                if (!viewHolder2.isInvalid() && viewHolder2.getLayoutPosition() == i && !viewHolder2.isAttachedToTransitionOverlay()) {
                    if (!z) {
                        this.f4506c.remove(i4);
                    }
                    return viewHolder2;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4761a(AbstractC1350a aVar, AbstractC1350a aVar2, boolean z) {
            mo4756a();
            mo4767c().onAdapterChanged(aVar, aVar2, z);
        }

        /* renamed from: a */
        public static ViewHolder m4556a(C1372o oVar, int i, long j) {
            if (C58012c.f132215a == null) {
                C58012c.f132215a = Boolean.valueOf(SettingsManager.m29616a().mo25400a("catch_tryGetViewHolderForPositionByDeadline_crash", true));
            }
            Boolean bool = C58012c.f132215a;
            if (bool == null) {
                C89219l.m154715b();
            }
            if (!bool.booleanValue()) {
                return oVar.m4554a(i, false, j);
            }
            try {
                return oVar.m4554a(i, false, j);
            } catch (IndexOutOfBoundsException e) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("tryGetViewHolderForPositionByDeadline crash hook, error: ").append(e.toString()).append(Arrays.toString(e.getStackTrace()));
                C80493gg.f180089b = stringBuffer.toString();
                return null;
            }
        }

        /* renamed from: a */
        private ViewHolder m4555a(long j, int i, boolean z) {
            for (int size = this.f4504a.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = this.f4504a.get(size);
                if (viewHolder.getItemId() == j && !viewHolder.wasReturnedFromScrap()) {
                    if (i == viewHolder.getItemViewType()) {
                        viewHolder.addFlags(32);
                        if (viewHolder.isRemoved() && !RecyclerView.this.f4386G.f4535g) {
                            viewHolder.setFlags(2, 14);
                        }
                        return viewHolder;
                    } else if (!z) {
                        this.f4504a.remove(size);
                        RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
                        mo4764b(viewHolder.itemView);
                    }
                }
            }
            for (int size2 = this.f4506c.size() - 1; size2 >= 0; size2--) {
                ViewHolder viewHolder2 = this.f4506c.get(size2);
                if (viewHolder2.getItemId() == j && !viewHolder2.isAttachedToTransitionOverlay()) {
                    if (i == viewHolder2.getItemViewType()) {
                        if (!z) {
                            this.f4506c.remove(size2);
                        }
                        return viewHolder2;
                    } else if (!z) {
                        mo4770d(size2);
                        return null;
                    }
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private androidx.recyclerview.widget.RecyclerView.ViewHolder m4554a(int r21, boolean r22, long r23) {
            /*
            // Method dump skipped, instructions count: 581
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1372o.m4554a(int, boolean, long):androidx.recyclerview.widget.RecyclerView$ViewHolder");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
            if (r1 != null) goto L_0x007e;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m4558a(androidx.recyclerview.widget.RecyclerView.ViewHolder r9, int r10, int r11, long r12) {
            /*
            // Method dump skipped, instructions count: 140
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1372o.m4558a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int, int, long):boolean");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo4409a(ViewHolder viewHolder, int i) {
        if (mo4484l()) {
            viewHolder.mPendingAccessibilityState = i;
            this.f4392M.add(viewHolder);
            return false;
        }
        C0792v.m2740a(viewHolder.itemView, i);
        return true;
    }

    @Override // androidx.core.p037h.AbstractC0781k
    /* renamed from: a */
    public final void mo2900a(int i) {
        getScrollingChildHelper().mo2910b(i);
    }

    /* renamed from: a */
    public final boolean mo4407a(int i, int i2, int i3, int i4, int i5) {
        return getScrollingChildHelper().mo2911b(i, i2, i3, i4, null, i5, null);
    }

    /* renamed from: a */
    public final void mo4396a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo2901a(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: a */
    public boolean mo4408a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo2909a(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: a */
    public final void mo4395a(int i, int i2) {
        mo4397a(i, i2, false);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class AbstractC1375r {

        /* renamed from: a */
        private final C1376a f4514a = new C1376a();

        /* renamed from: g */
        public int f4515g = -1;

        /* renamed from: h */
        RecyclerView f4516h;

        /* renamed from: i */
        public AbstractC1362i f4517i;

        /* renamed from: j */
        public boolean f4518j;

        /* renamed from: k */
        public boolean f4519k;

        /* renamed from: l */
        View f4520l;

        /* renamed from: m */
        boolean f4521m;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$r$b */
        public interface AbstractC1377b {
            static {
                Covode.recordClassIndex(1511);
            }

            /* renamed from: d */
            PointF mo4360d(int i);
        }

        static {
            Covode.recordClassIndex(1509);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo4773a();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo4775a(int i, int i2, C1376a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo4777a(View view, C1378s sVar, C1376a aVar);

        /* renamed from: androidx.recyclerview.widget.RecyclerView$r$a */
        public static class C1376a {

            /* renamed from: a */
            public int f4522a;

            /* renamed from: b */
            public int f4523b;

            /* renamed from: c */
            public int f4524c;

            /* renamed from: d */
            public int f4525d;

            /* renamed from: e */
            public Interpolator f4526e;

            /* renamed from: f */
            private boolean f4527f;

            /* renamed from: g */
            private int f4528g;

            static {
                Covode.recordClassIndex(1510);
            }

            public C1376a() {
                this((byte) 0);
            }

            /* renamed from: a */
            private void m4596a() {
                if (this.f4526e != null && this.f4524c <= 0) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f4524c <= 0) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            private C1376a(byte b) {
                this.f4525d = -1;
                this.f4522a = 0;
                this.f4523b = 0;
                this.f4524c = Integer.MIN_VALUE;
                this.f4526e = null;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public final void mo4781a(RecyclerView recyclerView) {
                int i = this.f4525d;
                if (i >= 0) {
                    this.f4525d = -1;
                    recyclerView.mo4423c(i);
                    this.f4527f = false;
                } else if (this.f4527f) {
                    m4596a();
                    recyclerView.f4383D.mo4787a(this.f4522a, this.f4523b, this.f4524c, this.f4526e);
                    this.f4528g++;
                    this.f4527f = false;
                } else {
                    this.f4528g = 0;
                }
            }

            /* renamed from: a */
            public final void mo4780a(int i, int i2, int i3, Interpolator interpolator) {
                this.f4522a = i;
                this.f4523b = i2;
                this.f4524c = i3;
                this.f4526e = interpolator;
                this.f4527f = true;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final void mo4779d() {
            if (this.f4519k) {
                this.f4519k = false;
                mo4773a();
                this.f4516h.f4386G.f4529a = -1;
                this.f4520l = null;
                this.f4515g = -1;
                this.f4518j = false;
                AbstractC1362i iVar = this.f4517i;
                if (iVar.f4493z == this) {
                    iVar.f4493z = null;
                }
                this.f4517i = null;
                this.f4516h = null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo4776a(View view) {
            if (RecyclerView.m4278e(view) == this.f4515g) {
                this.f4520l = view;
            }
        }

        /* renamed from: c */
        public PointF mo4778c(int i) {
            AbstractC1362i iVar = this.f4517i;
            if (iVar instanceof AbstractC1377b) {
                return ((AbstractC1377b) iVar).mo4360d(i);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4774a(int i, int i2) {
            PointF c;
            RecyclerView recyclerView = this.f4516h;
            if (this.f4515g == -1 || recyclerView == null) {
                mo4779d();
            }
            if (!(!this.f4518j || this.f4520l != null || this.f4517i == null || (c = mo4778c(this.f4515g)) == null || (c.x == 0.0f && c.y == 0.0f))) {
                recyclerView.mo4398a((int) Math.signum(c.x), (int) Math.signum(c.y), (int[]) null);
            }
            boolean z = false;
            this.f4518j = false;
            View view = this.f4520l;
            if (view != null) {
                if (RecyclerView.m4278e(view) == this.f4515g) {
                    mo4777a(this.f4520l, recyclerView.f4386G, this.f4514a);
                    this.f4514a.mo4781a(recyclerView);
                    mo4779d();
                } else {
                    this.f4520l = null;
                }
            }
            if (this.f4519k) {
                mo4775a(i, i2, this.f4514a);
                if (this.f4514a.f4525d >= 0) {
                    z = true;
                }
                this.f4514a.mo4781a(recyclerView);
                if (z && this.f4519k) {
                    this.f4518j = true;
                    recyclerView.f4383D.mo4786a();
                }
            }
        }
    }

    public static class RecycledViewPool {
        private int mAttachCount = 0;
        public SparseArray<ScrapData> mScrap = new SparseArray<>();

        static {
            Covode.recordClassIndex(1479);
        }

        /* access modifiers changed from: package-private */
        public void attach() {
            this.mAttachCount++;
        }

        /* access modifiers changed from: package-private */
        public void detach() {
            this.mAttachCount--;
        }

        public static class ScrapData {
            long mBindRunningAverageNs = 0;
            long mCreateRunningAverageNs = 0;
            public int mMaxScrap = 5;
            final ArrayList<ViewHolder> mScrapHeap = new ArrayList<>();

            static {
                Covode.recordClassIndex(1480);
            }

            ScrapData() {
            }
        }

        public void clear() {
            for (int i = 0; i < this.mScrap.size(); i++) {
                this.mScrap.valueAt(i).mScrapHeap.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public int size() {
            int i = 0;
            for (int i2 = 0; i2 < this.mScrap.size(); i2++) {
                ArrayList<ViewHolder> arrayList = this.mScrap.valueAt(i2).mScrapHeap;
                if (arrayList != null) {
                    i += arrayList.size();
                }
            }
            return i;
        }

        public int getRecycledViewCount(int i) {
            return getScrapDataForType(i).mScrapHeap.size();
        }

        private ScrapData getScrapDataForType(int i) {
            ScrapData scrapData = this.mScrap.get(i);
            if (scrapData != null) {
                return scrapData;
            }
            ScrapData scrapData2 = new ScrapData();
            this.mScrap.put(i, scrapData2);
            return scrapData2;
        }

        public ViewHolder getRecycledView(int i) {
            ScrapData scrapData = this.mScrap.get(i);
            if (scrapData == null || scrapData.mScrapHeap.isEmpty()) {
                return null;
            }
            ArrayList<ViewHolder> arrayList = scrapData.mScrapHeap;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public void putRecycledView(ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            ArrayList<ViewHolder> arrayList = getScrapDataForType(itemViewType).mScrapHeap;
            if (this.mScrap.get(itemViewType).mMaxScrap > arrayList.size()) {
                viewHolder.resetInternal();
                arrayList.add(viewHolder);
            }
        }

        /* access modifiers changed from: package-private */
        public void factorInBindTime(int i, long j) {
            ScrapData scrapDataForType = getScrapDataForType(i);
            scrapDataForType.mBindRunningAverageNs = runningAverage(scrapDataForType.mBindRunningAverageNs, j);
        }

        /* access modifiers changed from: package-private */
        public void factorInCreateTime(int i, long j) {
            ScrapData scrapDataForType = getScrapDataForType(i);
            scrapDataForType.mCreateRunningAverageNs = runningAverage(scrapDataForType.mCreateRunningAverageNs, j);
        }

        /* access modifiers changed from: package-private */
        public long runningAverage(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return ((j / 4) * 3) + (j2 / 4);
        }

        public void setMaxRecycledViews(int i, int i2) {
            ScrapData scrapDataForType = getScrapDataForType(i);
            scrapDataForType.mMaxScrap = i2;
            ArrayList<ViewHolder> arrayList = scrapDataForType.mScrapHeap;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        /* access modifiers changed from: package-private */
        public void onAdapterChanged(AbstractC1350a aVar, AbstractC1350a aVar2, boolean z) {
            if (aVar != null) {
                detach();
            }
            if (!z && this.mAttachCount == 0) {
                clear();
            }
            if (aVar2 != null) {
                attach();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean willBindInTime(int i, long j, long j2) {
            long j3 = getScrapDataForType(i).mBindRunningAverageNs;
            if (j3 == 0 || j + j3 < j2) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean willCreateInTime(int i, long j, long j2) {
            long j3 = getScrapDataForType(i).mCreateRunningAverageNs;
            if (j3 == 0 || j + j3 < j2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public static abstract class AbstractC1350a<VH extends ViewHolder> {
        public boolean mHasStableIds = false;
        private final C1352b mObservable = new C1352b();
        public EnumC1351a mStateRestorationPolicy = EnumC1351a.ALLOW;

        static {
            Covode.recordClassIndex(1484);
        }

        public int findRelativeAdapterPositionIn(AbstractC1350a<? extends ViewHolder> aVar, ViewHolder viewHolder, int i) {
            if (aVar == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public final boolean hasObservers() {
            return this.mObservable.mo4649a();
        }

        public final void notifyDataSetChanged() {
            this.mObservable.mo4650b();
        }

        /* access modifiers changed from: package-private */
        public boolean canRestoreState() {
            int i = C13487.f4462a[this.mStateRestorationPolicy.ordinal()];
            if (i == 1 || (i == 2 && getItemCount() <= 0)) {
                return false;
            }
            return true;
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$a$a */
        public enum EnumC1351a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT;

            static {
                Covode.recordClassIndex(1485);
            }
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.mo4647a(i, 1);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.mo4651b(i, 1);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.mo4653c(i, 1);
        }

        public void registerAdapterDataObserver(AbstractC1353c cVar) {
            this.mObservable.registerObserver(cVar);
        }

        public void setStateRestorationPolicy(EnumC1351a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.mo4652c();
        }

        public void unregisterAdapterDataObserver(AbstractC1353c cVar) {
            this.mObservable.unregisterObserver(cVar);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.mo4654d(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.mo4647a(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.mo4651b(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.mo4653c(i, i2);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.mo4648a(i, 1, obj);
        }

        public final void bindViewHolder(VH vh, int i) {
            boolean z;
            if (vh.mBindingAdapter == null) {
                z = true;
                vh.mPosition = i;
                if (this.mHasStableIds) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                C0654g.m2391a("RV OnBindView");
            } else {
                z = false;
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof C1367j) {
                    ((C1367j) layoutParams).f4502e = true;
                }
                C0654g.m2390a();
            }
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                C0654g.m2391a("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C0654g.m2390a();
            }
        }

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.mo4648a(i, i2, obj);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public static class C1367j extends ViewGroup.MarginLayoutParams {

        /* renamed from: c */
        public ViewHolder f4500c;

        /* renamed from: d */
        final Rect f4501d = new Rect();

        /* renamed from: e */
        boolean f4502e = true;

        /* renamed from: f */
        boolean f4503f = false;

        static {
            Covode.recordClassIndex(1501);
        }

        /* renamed from: A_ */
        public final boolean mo4744A_() {
            return this.f4500c.isInvalid();
        }

        /* renamed from: B_ */
        public final boolean mo4745B_() {
            return this.f4500c.isRemoved();
        }

        /* renamed from: C_ */
        public final int mo4746C_() {
            return this.f4500c.getBindingAdapterPosition();
        }

        public C1367j(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1367j(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1367j(C1367j jVar) {
            super((ViewGroup.LayoutParams) jVar);
        }

        public C1367j(int i, int i2) {
            super(i, i2);
        }

        public C1367j(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: y */
    private void m4291y() {
        m4290x();
        setScrollState(0);
    }

    /* renamed from: c */
    public final void mo4422c() {
        List<AbstractC1368k> list = this.f4456z;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: f */
    public final void mo4452f() {
        List<AbstractC1371n> list = this.f4434az;
        if (list != null) {
            list.clear();
        }
    }

    public int getItemDecorationCount() {
        return this.f4448r.size();
    }

    public RecycledViewPool getRecycledViewPool() {
        return this.f4435e.mo4767c();
    }

    /* renamed from: i */
    public final void mo4479i() {
        setScrollState(0);
        mo5599q();
    }

    @Override // androidx.core.p037h.AbstractC0780j
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f2940a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo4482j() {
        this.f4412ad++;
    }

    /* renamed from: l */
    public final boolean mo4484l() {
        if (this.f4412ad > 0) {
            return true;
        }
        return false;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.recyclerview.widget.RecyclerView.SavedState.C13491 */

            static {
                Covode.recordClassIndex(1482);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        Parcelable f4463a;

        static {
            Covode.recordClassIndex(1481);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f4463a, 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4463a = parcel.readParcelable(classLoader == null ? AbstractC1362i.class.getClassLoader() : classLoader);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public static class C1378s {

        /* renamed from: a */
        public int f4529a = -1;

        /* renamed from: b */
        int f4530b;

        /* renamed from: c */
        int f4531c;

        /* renamed from: d */
        int f4532d = 1;

        /* renamed from: e */
        int f4533e;

        /* renamed from: f */
        public boolean f4534f;

        /* renamed from: g */
        public boolean f4535g;

        /* renamed from: h */
        boolean f4536h;

        /* renamed from: i */
        public boolean f4537i;

        /* renamed from: j */
        public boolean f4538j;

        /* renamed from: k */
        public boolean f4539k;

        /* renamed from: l */
        int f4540l;

        /* renamed from: m */
        long f4541m;

        /* renamed from: n */
        int f4542n;

        /* renamed from: o */
        public int f4543o;

        /* renamed from: p */
        public int f4544p;

        /* renamed from: q */
        private SparseArray<Object> f4545q;

        static {
            Covode.recordClassIndex(1512);
        }

        /* renamed from: a */
        public final int mo4782a() {
            if (this.f4535g) {
                return this.f4530b - this.f4531c;
            }
            return this.f4533e;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f4529a + ", mData=" + this.f4545q + ", mItemCount=" + this.f4533e + ", mIsMeasuring=" + this.f4537i + ", mPreviousLayoutItemCount=" + this.f4530b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4531c + ", mStructureChanged=" + this.f4534f + ", mInPreLayout=" + this.f4535g + ", mRunSimpleAnimations=" + this.f4538j + ", mRunPredictiveAnimations=" + this.f4539k + '}';
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4783a(int i) {
            if ((this.f4532d & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f4532d));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public class RunnableC1380u implements Runnable {

        /* renamed from: a */
        int f4546a;

        /* renamed from: b */
        int f4547b;

        /* renamed from: c */
        OverScroller f4548c;

        /* renamed from: d */
        Interpolator f4549d = RecyclerView.f4371N;

        /* renamed from: f */
        private boolean f4551f;

        /* renamed from: g */
        private boolean f4552g;

        static {
            Covode.recordClassIndex(1514);
        }

        /* renamed from: c */
        private void m4604c() {
            RecyclerView.this.removeCallbacks(this);
            C0792v.m2750a(RecyclerView.this, this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4786a() {
            if (this.f4551f) {
                this.f4552g = true;
            } else {
                m4604c();
            }
        }

        /* renamed from: b */
        public final void mo4788b() {
            RecyclerView.this.removeCallbacks(this);
            this.f4548c.abortAnimation();
        }

        public final void run() {
            int i;
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            int i3;
            if (RecyclerView.this.f4445o == null) {
                mo4788b();
                return;
            }
            this.f4552g = false;
            this.f4551f = true;
            RecyclerView.this.mo4455g();
            OverScroller overScroller = this.f4548c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f4546a;
                int i5 = currY - this.f4547b;
                this.f4546a = currX;
                this.f4547b = currY;
                RecyclerView.this.f4391L[0] = 0;
                RecyclerView.this.f4391L[1] = 0;
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mo4408a(i4, i5, recyclerView.f4391L, (int[]) null, 1)) {
                    i4 -= RecyclerView.this.f4391L[0];
                    i5 -= RecyclerView.this.f4391L[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.mo4424c(i4, i5);
                }
                if (RecyclerView.this.f4444n != null) {
                    RecyclerView.this.f4391L[0] = 0;
                    RecyclerView.this.f4391L[1] = 0;
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.mo4398a(i4, i5, recyclerView2.f4391L);
                    i = RecyclerView.this.f4391L[0];
                    i2 = RecyclerView.this.f4391L[1];
                    i4 -= i;
                    i5 -= i2;
                    AbstractC1375r rVar = RecyclerView.this.f4445o.f4493z;
                    if (rVar != null && !rVar.f4518j && rVar.f4519k) {
                        int a = RecyclerView.this.f4386G.mo4782a();
                        if (a == 0) {
                            rVar.mo4779d();
                        } else {
                            if (rVar.f4515g >= a) {
                                rVar.f4515g = a - 1;
                            }
                            rVar.mo4774a(i, i2);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.f4448r.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView.this.f4391L[0] = 0;
                RecyclerView.this.f4391L[1] = 0;
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mo4396a(i, i2, i4, i5, null, 1, recyclerView3.f4391L);
                int i6 = i4 - RecyclerView.this.f4391L[0];
                int i7 = i5 - RecyclerView.this.f4391L[1];
                if (!(i == 0 && i2 == 0)) {
                    RecyclerView.this.mo4453f(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z = true;
                } else {
                    z = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (overScroller.isFinished() || ((z || i6 != 0) && (z2 || i7 != 0))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                AbstractC1375r rVar2 = RecyclerView.this.f4445o.f4493z;
                if ((rVar2 == null || !rVar2.f4518j) && z3) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i6 < 0) {
                            i3 = -currVelocity;
                        } else if (i6 > 0) {
                            i3 = currVelocity;
                        } else {
                            i3 = 0;
                        }
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.mo4436d(i3, currVelocity);
                    }
                    if (RecyclerView.f4379d) {
                        RecyclerView.this.f4385F.mo4969a();
                    }
                } else {
                    mo4786a();
                    if (RecyclerView.this.f4384E != null) {
                        RecyclerView.this.f4384E.mo4966a(RecyclerView.this, i, i2);
                    }
                }
            }
            AbstractC1375r rVar3 = RecyclerView.this.f4445o.f4493z;
            if (rVar3 != null && rVar3.f4518j) {
                rVar3.mo4774a(0, 0);
            }
            this.f4551f = false;
            if (this.f4552g) {
                m4604c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.mo2900a(1);
        }

        RunnableC1380u() {
            this.f4548c = new OverScroller(RecyclerView.this.getContext(), RecyclerView.f4371N);
        }

        /* renamed from: a */
        private int m4603a(int i, int i2) {
            boolean z;
            int height;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                z = true;
            } else {
                z = false;
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (z) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
                abs = abs2;
            }
            return Math.min((int) (((((float) abs) / ((float) height)) + 1.0f) * 300.0f), (int) LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        }

        /* renamed from: a */
        public final void mo4787a(int i, int i2, int i3, Interpolator interpolator) {
            int i4 = i3;
            if (i4 == Integer.MIN_VALUE) {
                i4 = m4603a(i, i2);
            }
            if (interpolator == null) {
                interpolator = RecyclerView.f4371N;
            }
            if (this.f4549d != interpolator) {
                this.f4549d = interpolator;
                this.f4548c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f4547b = 0;
            this.f4546a = 0;
            RecyclerView.this.setScrollState(2);
            this.f4548c.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f4548c.computeScrollOffset();
            }
            mo4786a();
        }
    }

    /* renamed from: A */
    private boolean m4245A() {
        if (this.f4382C == null || !this.f4445o.mo4340x_()) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    private void m4249E() {
        this.f4386G.f4541m = -1;
        this.f4386G.f4540l = -1;
        this.f4386G.f4542n = -1;
    }

    private C0783m getScrollingChildHelper() {
        if (this.f4401aD == null) {
            this.f4401aD = new C0783m(this);
        }
        return this.f4401aD;
    }

    /* renamed from: q */
    private void mo5599q() {
        this.f4383D.mo4788b();
        AbstractC1362i iVar = this.f4445o;
        if (iVar != null) {
            iVar.mo4686B();
        }
    }

    /* renamed from: w */
    private void m4289w() {
        this.f4418aj = null;
        this.f4416ah = null;
        this.f4417ai = null;
        this.f4415ag = null;
    }

    /* renamed from: x */
    private void m4290x() {
        VelocityTracker velocityTracker = this.f4421am;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        mo2900a(0);
        mo27122r();
    }

    public int getBaseline() {
        if (this.f4445o != null) {
            return -1;
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f4379d) {
            return System.nanoTime();
        }
        return 0;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo2905a(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo4483k() {
        AccessibilityManager accessibilityManager = this.f4411ac;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public final boolean mo4486n() {
        AbstractC1356f fVar = this.f4382C;
        if (fVar == null || !fVar.mo4668b()) {
            return false;
        }
        return true;
    }

    public void requestLayout() {
        if (this.f4397W != 0 || this.f4454x) {
            this.f4453w = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // androidx.core.p037h.AbstractC0780j
    public void stopNestedScroll() {
        getScrollingChildHelper().mo2910b(0);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public static abstract class AbstractC1356f {

        /* renamed from: a */
        private ArrayList<AbstractC1357a> f4465a = new ArrayList<>();

        /* renamed from: h */
        public AbstractC1358b f4466h;

        /* renamed from: i */
        public long f4467i = 120;

        /* renamed from: j */
        public long f4468j = 120;

        /* renamed from: k */
        public long f4469k = 250;

        /* renamed from: l */
        public long f4470l = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$f$a */
        public interface AbstractC1357a {
            static {
                Covode.recordClassIndex(1491);
            }

            /* renamed from: a */
            void mo4676a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$f$b */
        interface AbstractC1358b {
            static {
                Covode.recordClassIndex(1492);
            }

            /* renamed from: a */
            void mo4677a(ViewHolder viewHolder);
        }

        static {
            Covode.recordClassIndex(1490);
        }

        /* renamed from: a */
        public abstract void mo4663a();

        /* renamed from: a */
        public abstract boolean mo4664a(ViewHolder viewHolder, ViewHolder viewHolder2, C1359c cVar, C1359c cVar2);

        /* renamed from: a */
        public abstract boolean mo4665a(ViewHolder viewHolder, C1359c cVar, C1359c cVar2);

        /* renamed from: b */
        public abstract boolean mo4668b();

        /* renamed from: b */
        public abstract boolean mo4669b(ViewHolder viewHolder, C1359c cVar, C1359c cVar2);

        /* renamed from: c */
        public abstract void mo4670c(ViewHolder viewHolder);

        /* renamed from: c */
        public abstract boolean mo4671c(ViewHolder viewHolder, C1359c cVar, C1359c cVar2);

        /* renamed from: d */
        public abstract void mo4672d();

        /* renamed from: g */
        public boolean mo4675g(ViewHolder viewHolder) {
            return true;
        }

        /* renamed from: e */
        public final void mo4673e() {
            int size = this.f4465a.size();
            for (int i = 0; i < size; i++) {
                this.f4465a.get(i).mo4676a();
            }
            this.f4465a.clear();
        }

        /* renamed from: f */
        public final void mo4674f(ViewHolder viewHolder) {
            AbstractC1358b bVar = this.f4466h;
            if (bVar != null) {
                bVar.mo4677a(viewHolder);
            }
        }

        /* renamed from: d */
        public static C1359c m4394d(ViewHolder viewHolder) {
            return new C1359c().mo4678a(viewHolder);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$f$c */
        public static class C1359c {

            /* renamed from: a */
            public int f4471a;

            /* renamed from: b */
            public int f4472b;

            /* renamed from: c */
            public int f4473c;

            /* renamed from: d */
            public int f4474d;

            static {
                Covode.recordClassIndex(1493);
            }

            /* renamed from: a */
            public final C1359c mo4678a(ViewHolder viewHolder) {
                View view = viewHolder.itemView;
                this.f4471a = view.getLeft();
                this.f4472b = view.getTop();
                this.f4473c = view.getRight();
                this.f4474d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m4395e(ViewHolder viewHolder) {
            int i = viewHolder.mFlags & 14;
            if (viewHolder.isInvalid()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int oldPosition = viewHolder.getOldPosition();
            int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
            if (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) {
                return i;
            }
            return i | 2048;
        }

        /* renamed from: a */
        public final boolean mo4667a(AbstractC1357a aVar) {
            boolean b = mo4668b();
            if (aVar != null) {
                if (!b) {
                    aVar.mo4676a();
                } else {
                    this.f4465a.add(aVar);
                }
            }
            return b;
        }

        /* renamed from: a */
        public boolean mo4666a(ViewHolder viewHolder, List<Object> list) {
            return mo4675g(viewHolder);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public class C1374q extends AbstractC1353c {
        static {
            Covode.recordClassIndex(1508);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: b */
        public final void mo4659b() {
            AbstractC1350a aVar;
            if (RecyclerView.this.f4436f != null && (aVar = RecyclerView.this.f4444n) != null && aVar.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: c */
        private void m4582c() {
            if (!RecyclerView.f4378c || !RecyclerView.this.f4450t || !RecyclerView.this.f4449s) {
                RecyclerView.this.f4455y = true;
                RecyclerView.this.requestLayout();
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            C0792v.m2750a(recyclerView, recyclerView.f4441k);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4655a() {
            RecyclerView.this.mo4437d_(null);
            RecyclerView.this.f4386G.f4534f = true;
            RecyclerView.this.mo4426c(true);
            if (!RecyclerView.this.f4437g.mo4844d()) {
                RecyclerView.this.requestLayout();
            }
        }

        C1374q() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: b */
        public final void mo4660b(int i, int i2) {
            RecyclerView.this.mo4437d_(null);
            C1387a aVar = RecyclerView.this.f4437g;
            if (i2 > 0) {
                aVar.f4609a.add(aVar.mo4836a(1, i, i2, null));
                aVar.f4615g |= 1;
                if (aVar.f4609a.size() == 1) {
                    m4582c();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: c */
        public final void mo4661c(int i, int i2) {
            RecyclerView.this.mo4437d_(null);
            C1387a aVar = RecyclerView.this.f4437g;
            if (i2 > 0) {
                aVar.f4609a.add(aVar.mo4836a(2, i, i2, null));
                aVar.f4615g |= 2;
                if (aVar.f4609a.size() == 1) {
                    m4582c();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4657a(int i, int i2, int i3) {
            RecyclerView.this.mo4437d_(null);
            C1387a aVar = RecyclerView.this.f4437g;
            if (i == i2) {
                return;
            }
            if (i3 == 1) {
                aVar.f4609a.add(aVar.mo4836a(8, i, i2, null));
                aVar.f4615g |= 8;
                if (aVar.f4609a.size() == 1) {
                    m4582c();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4658a(int i, int i2, Object obj) {
            RecyclerView.this.mo4437d_(null);
            C1387a aVar = RecyclerView.this.f4437g;
            if (i2 > 0) {
                aVar.f4609a.add(aVar.mo4836a(4, i, i2, obj));
                aVar.f4615g |= 4;
                if (aVar.f4609a.size() == 1) {
                    m4582c();
                }
            }
        }
    }

    /* renamed from: K */
    private void m4255K() {
        int b = this.f4438h.mo4899b();
        for (int i = 0; i < b; i++) {
            ViewHolder c = m4275c(this.f4438h.mo4903c(i));
            if (!c.shouldIgnore()) {
                c.saveOldPosition();
            }
        }
    }

    /* renamed from: z */
    private void m4292z() {
        int i = this.f4410ab;
        this.f4410ab = 0;
        if (i != 0 && mo4483k()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C0729b.m2592a(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    public int computeHorizontalScrollExtent() {
        AbstractC1362i iVar = this.f4445o;
        if (iVar != null && iVar.mo4366f()) {
            return this.f4445o.mo4365f(this.f4386G);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        AbstractC1362i iVar = this.f4445o;
        if (iVar != null && iVar.mo4366f()) {
            return this.f4445o.mo4338d(this.f4386G);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        AbstractC1362i iVar = this.f4445o;
        if (iVar != null && iVar.mo4366f()) {
            return this.f4445o.mo4333b(this.f4386G);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        AbstractC1362i iVar = this.f4445o;
        if (iVar != null && iVar.mo4368g()) {
            return this.f4445o.mo4367g(this.f4386G);
        }
        return 0;
    }

    @Override // androidx.core.p037h.AbstractC0790t
    public int computeVerticalScrollOffset() {
        AbstractC1362i iVar = this.f4445o;
        if (iVar != null && iVar.mo4368g()) {
            return this.f4445o.mo4339e(this.f4386G);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        AbstractC1362i iVar = this.f4445o;
        if (iVar != null && iVar.mo4368g()) {
            return this.f4445o.mo4336c(this.f4386G);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo4476h() {
        int i = this.f4397W + 1;
        this.f4397W = i;
        if (i == 1 && !this.f4454x) {
            this.f4453w = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo4485m() {
        if (!this.f4389J && this.f4449s) {
            C0792v.m2750a(this, this.f4404aG);
            this.f4389J = true;
        }
    }

    /* renamed from: o */
    public final void mo4487o() {
        if (this.f4448r.size() != 0) {
            AbstractC1362i iVar = this.f4445o;
            if (iVar != null) {
                iVar.mo4355a("Cannot invalidate item decorations during a scroll or layout");
            }
            m4254J();
            requestLayout();
        }
    }

    /* renamed from: p */
    public final boolean mo4500p() {
        if (!this.f4452v || this.f4380A || this.f4437g.mo4844d()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$7 */
    public static /* synthetic */ class C13487 {

        /* renamed from: a */
        static final /* synthetic */ int[] f4462a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 1478(0x5c6, float:2.071E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.recyclerview.widget.RecyclerView$a$a[] r0 = androidx.recyclerview.widget.RecyclerView.AbstractC1350a.EnumC1351a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                androidx.recyclerview.widget.RecyclerView.C13487.f4462a = r2
                androidx.recyclerview.widget.RecyclerView$a$a r0 = androidx.recyclerview.widget.RecyclerView.AbstractC1350a.EnumC1351a.PREVENT     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = androidx.recyclerview.widget.RecyclerView.C13487.f4462a     // Catch:{ NoSuchFieldError -> 0x0022 }
                androidx.recyclerview.widget.RecyclerView$a$a r0 = androidx.recyclerview.widget.RecyclerView.AbstractC1350a.EnumC1351a.PREVENT_WHEN_EMPTY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C13487.<clinit>():void");
        }
    }

    /* renamed from: J */
    private void m4254J() {
        int b = this.f4438h.mo4899b();
        for (int i = 0; i < b; i++) {
            ((C1367j) this.f4438h.mo4903c(i).getLayoutParams()).f4502e = true;
        }
        this.f4435e.mo4772f();
    }

    /* renamed from: L */
    private void m4256L() {
        int b = this.f4438h.mo4899b();
        for (int i = 0; i < b; i++) {
            ViewHolder c = m4275c(this.f4438h.mo4903c(i));
            if (!c.shouldIgnore()) {
                c.clearOldPosition();
            }
        }
        this.f4435e.mo4771e();
    }

    /* renamed from: M */
    private void m4257M() {
        int b = this.f4438h.mo4899b();
        for (int i = 0; i < b; i++) {
            ViewHolder c = m4275c(this.f4438h.mo4903c(i));
            if (c != null && !c.shouldIgnore()) {
                c.addFlags(6);
            }
        }
        m4254J();
        this.f4435e.mo4769d();
    }

    /* renamed from: N */
    private void m4258N() {
        int i;
        for (int size = this.f4392M.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = this.f4392M.get(size);
            if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore() && (i = viewHolder.mPendingAccessibilityState) != -1) {
                C0792v.m2740a(viewHolder.itemView, i);
                viewHolder.mPendingAccessibilityState = -1;
            }
        }
        this.f4392M.clear();
    }

    /* renamed from: r */
    private void mo27122r() {
        boolean z;
        EdgeEffect edgeEffect = this.f4415ag;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f4415ag.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f4416ah;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f4416ah.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4417ai;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f4417ai.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4418aj;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f4418aj.isFinished();
        }
        if (z) {
            C0792v.m2764c(this);
        }
    }

    /* renamed from: s */
    private void mo63602s() {
        if (this.f4415ag == null) {
            EdgeEffect a = C1355e.m4393a(this);
            this.f4415ag = a;
            if (this.f4440j) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: t */
    private void m4286t() {
        if (this.f4417ai == null) {
            EdgeEffect a = C1355e.m4393a(this);
            this.f4417ai = a;
            if (this.f4440j) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: u */
    private void m4287u() {
        if (this.f4416ah == null) {
            EdgeEffect a = C1355e.m4393a(this);
            this.f4416ah = a;
            if (this.f4440j) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: v */
    private void m4288v() {
        if (this.f4418aj == null) {
            EdgeEffect a = C1355e.m4393a(this);
            this.f4418aj = a;
            if (this.f4440j) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: d */
    public final AbstractC1361h mo4434d() {
        int itemDecorationCount = getItemDecorationCount();
        if (itemDecorationCount > 0) {
            return this.f4448r.get(0);
        }
        throw new IndexOutOfBoundsException("0 is an invalid index for size " + itemDecorationCount);
    }

    /* renamed from: e */
    public final void mo4448e() {
        int itemDecorationCount = getItemDecorationCount();
        if (itemDecorationCount > 0) {
            mo4425c(mo4434d());
            return;
        }
        throw new IndexOutOfBoundsException("0 is an invalid index for size ".concat(String.valueOf(itemDecorationCount)));
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC1362i iVar = this.f4445o;
        if (iVar != null) {
            return iVar.mo4334b();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo4394a());
    }

    public void onDetachedFromWindow() {
        RunnableC1461m mVar;
        super.onDetachedFromWindow();
        AbstractC1356f fVar = this.f4382C;
        if (fVar != null) {
            fVar.mo4672d();
        }
        mo4479i();
        this.f4449s = false;
        AbstractC1362i iVar = this.f4445o;
        if (iVar != null) {
            iVar.mo4706b(this, this.f4435e);
        }
        this.f4392M.clear();
        removeCallbacks(this.f4404aG);
        do {
        } while (C1406af.C1407a.f4644d.acquire() != null);
        if (f4379d && (mVar = this.f4384E) != null) {
            mVar.f4829b.remove(this);
            this.f4384E = null;
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f4436f;
        if (savedState2 != null) {
            savedState.f4463a = savedState2.f4463a;
        } else {
            AbstractC1362i iVar = this.f4445o;
            if (iVar != null) {
                savedState.f4463a = iVar.mo4362e();
            } else {
                savedState.f4463a = null;
            }
        }
        return savedState;
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        Covode.recordClassIndex(1471);
        if (Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 20) {
            z = true;
        } else {
            z = false;
        }
        f4376a = z;
        if (Build.VERSION.SDK_INT >= 23) {
            z2 = true;
        } else {
            z2 = false;
        }
        f4377b = z2;
        int i = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 21) {
            z3 = true;
        } else {
            z3 = false;
        }
        f4379d = z3;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
    }

    /* renamed from: B */
    private void m4246B() {
        boolean z;
        boolean z2;
        if (this.f4380A) {
            this.f4437g.mo4837a();
            if (this.f4381B) {
                this.f4445o.mo4341y_();
            }
        }
        if (m4245A()) {
            this.f4437g.mo4841b();
        } else {
            this.f4437g.mo4845e();
        }
        boolean z3 = false;
        if (this.f4387H || this.f4388I) {
            z = true;
        } else {
            z = false;
        }
        C1378s sVar = this.f4386G;
        if (!this.f4452v || this.f4382C == null || ((!this.f4380A && !z && !this.f4445o.f4476A) || (this.f4380A && !this.f4444n.mHasStableIds))) {
            z2 = false;
        } else {
            z2 = true;
        }
        sVar.f4538j = z2;
        C1378s sVar2 = this.f4386G;
        if (sVar2.f4538j && z && !this.f4380A && m4245A()) {
            z3 = true;
        }
        sVar2.f4539k = z3;
    }

    /* renamed from: C */
    private void m4247C() {
        boolean z;
        if (this.f4444n != null && this.f4445o != null) {
            this.f4386G.f4537i = false;
            if (!this.f4405aH || (this.f4406aI == getWidth() && this.f4407aJ == getHeight())) {
                z = false;
            } else {
                z = true;
            }
            this.f4406aI = 0;
            this.f4407aJ = 0;
            this.f4405aH = false;
            if (this.f4386G.f4532d == 1) {
                m4251G();
                this.f4445o.mo4716d(this);
                m4252H();
            } else if (this.f4437g.mo4846f() || z || this.f4445o.f4485J != getWidth() || this.f4445o.f4486K != getHeight()) {
                this.f4445o.mo4716d(this);
                m4252H();
            } else {
                this.f4445o.mo4716d(this);
            }
            m4253I();
        }
    }

    /* renamed from: D */
    private void m4248D() {
        View focusedChild;
        View b;
        ViewHolder a;
        long j;
        int absoluteAdapterPosition;
        if (!this.f4432ax || !hasFocus() || this.f4444n == null || (focusedChild = getFocusedChild()) == null || (b = mo4411b(focusedChild)) == null || (a = mo4393a(b)) == null) {
            m4249E();
            return;
        }
        C1378s sVar = this.f4386G;
        if (this.f4444n.mHasStableIds) {
            j = a.getItemId();
        } else {
            j = -1;
        }
        sVar.f4541m = j;
        C1378s sVar2 = this.f4386G;
        if (this.f4380A) {
            absoluteAdapterPosition = -1;
        } else if (a.isRemoved()) {
            absoluteAdapterPosition = a.mOldPosition;
        } else {
            absoluteAdapterPosition = a.getAbsoluteAdapterPosition();
        }
        sVar2.f4540l = absoluteAdapterPosition;
        C1378s sVar3 = this.f4386G;
        View view = a.itemView;
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        sVar3.f4542n = id;
    }

    /* renamed from: H */
    private void m4252H() {
        boolean z;
        mo4476h();
        mo4482j();
        this.f4386G.mo4783a(6);
        this.f4437g.mo4845e();
        this.f4386G.f4533e = this.f4444n.getItemCount();
        this.f4386G.f4531c = 0;
        if (this.f4436f != null && this.f4444n.canRestoreState()) {
            if (this.f4436f.f4463a != null) {
                this.f4445o.mo4350a(this.f4436f.f4463a);
            }
            this.f4436f = null;
        }
        this.f4386G.f4535g = false;
        this.f4445o.mo4337c(this.f4435e, this.f4386G);
        this.f4386G.f4534f = false;
        C1378s sVar = this.f4386G;
        if (!sVar.f4538j || this.f4382C == null) {
            z = false;
        } else {
            z = true;
        }
        sVar.f4538j = z;
        this.f4386G.f4532d = 4;
        mo4419b(true);
        mo4406a(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo4412b() {
        AbstractC1356f fVar = this.f4382C;
        if (fVar != null) {
            fVar.mo4672d();
        }
        AbstractC1362i iVar = this.f4445o;
        if (iVar != null) {
            iVar.mo4711c(this.f4435e);
            this.f4445o.mo4704b(this.f4435e);
        }
        this.f4435e.mo4756a();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4412ad = 0;
        boolean z = true;
        this.f4449s = true;
        if (!this.f4452v || isLayoutRequested()) {
            z = false;
        }
        this.f4452v = z;
        AbstractC1362i iVar = this.f4445o;
        if (iVar != null) {
            iVar.mo4705b(this);
        }
        this.f4389J = false;
        if (f4379d) {
            RunnableC1461m mVar = RunnableC1461m.f4827a.get();
            this.f4384E = mVar;
            if (mVar == null) {
                this.f4384E = new RunnableC1461m();
                int i = Build.VERSION.SDK_INT;
                Display display = getDisplay();
                float f = 60.0f;
                if (!isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                this.f4384E.f4831d = (long) (1.0E9f / f);
                RunnableC1461m.f4827a.set(this.f4384E);
            }
            this.f4384E.f4829b.add(this);
        }
    }

    /* renamed from: I */
    private void m4253I() {
        this.f4386G.mo4783a(4);
        mo4476h();
        mo4482j();
        this.f4386G.f4532d = 1;
        if (this.f4386G.f4538j) {
            for (int a = this.f4438h.mo4894a() - 1; a >= 0; a--) {
                ViewHolder c = m4275c(this.f4438h.mo4900b(a));
                if (!c.shouldIgnore()) {
                    long e = m4279e(c);
                    AbstractC1356f.C1359c a2 = new AbstractC1356f.C1359c().mo4678a(c);
                    ViewHolder a3 = this.f4439i.mo4870a(e);
                    if (a3 != null && !a3.shouldIgnore()) {
                        boolean a4 = this.f4439i.mo4876a(a3);
                        boolean a5 = this.f4439i.mo4876a(c);
                        if (!a4 || a3 != c) {
                            AbstractC1356f.C1359c a6 = this.f4439i.mo4871a(a3, 4);
                            this.f4439i.mo4880c(c, a2);
                            AbstractC1356f.C1359c a7 = this.f4439i.mo4871a(c, 8);
                            if (a6 == null) {
                                m4261a(e, c);
                            } else {
                                m4264a(a3, c, a6, a7, a4, a5);
                            }
                        }
                    }
                    this.f4439i.mo4880c(c, a2);
                }
            }
            this.f4439i.mo4875a(this.f4408aK);
        }
        this.f4445o.mo4704b(this.f4435e);
        C1378s sVar = this.f4386G;
        sVar.f4530b = sVar.f4533e;
        this.f4380A = false;
        this.f4381B = false;
        this.f4386G.f4538j = false;
        this.f4386G.f4539k = false;
        this.f4445o.f4476A = false;
        if (this.f4435e.f4505b != null) {
            this.f4435e.f4505b.clear();
        }
        if (this.f4445o.f4482G) {
            this.f4445o.f4481F = 0;
            this.f4445o.f4482G = false;
            this.f4435e.mo4763b();
        }
        this.f4445o.mo4324a(this.f4386G);
        mo4419b(true);
        mo4406a(false);
        this.f4439i.mo4872a();
        int[] iArr = this.f4400aC;
        if (mo111273g(iArr[0], iArr[1])) {
            mo4453f(0, 0);
        }
        m4250F();
        m4249E();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo4455g() {
        if (!this.f4452v || this.f4380A) {
            C0654g.m2391a("RV FullInvalidate");
            m4247C();
            C0654g.m2390a();
        } else if (this.f4437g.mo4844d()) {
            if (this.f4437g.mo4839a(4) && !this.f4437g.mo4839a(11)) {
                C0654g.m2391a("RV PartialInvalidate");
                mo4476h();
                mo4482j();
                this.f4437g.mo4841b();
                if (!this.f4453w) {
                    int a = this.f4438h.mo4894a();
                    int i = 0;
                    while (true) {
                        if (i < a) {
                            ViewHolder c = m4275c(this.f4438h.mo4900b(i));
                            if (c != null && !c.shouldIgnore() && c.isUpdated()) {
                                m4247C();
                                break;
                            }
                            i++;
                        } else {
                            this.f4437g.mo4843c();
                            break;
                        }
                    }
                }
                mo4406a(true);
                mo4419b(true);
                C0654g.m2390a();
            } else if (this.f4437g.mo4844d()) {
                C0654g.m2391a("RV FullInvalidate");
                m4247C();
                C0654g.m2390a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0111, code lost:
        if (r8 != null) goto L_0x0113;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a0  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4250F() {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4250F():void");
    }

    /* renamed from: G */
    private void m4251G() {
        boolean z;
        this.f4386G.mo4783a(1);
        m4266a(this.f4386G);
        this.f4386G.f4537i = false;
        mo4476h();
        this.f4439i.mo4872a();
        mo4482j();
        m4246B();
        m4248D();
        C1378s sVar = this.f4386G;
        if (!sVar.f4538j || !this.f4388I) {
            z = false;
        } else {
            z = true;
        }
        sVar.f4536h = z;
        this.f4388I = false;
        this.f4387H = false;
        C1378s sVar2 = this.f4386G;
        sVar2.f4535g = sVar2.f4539k;
        this.f4386G.f4533e = this.f4444n.getItemCount();
        m4270a(this.f4400aC);
        if (this.f4386G.f4538j) {
            int a = this.f4438h.mo4894a();
            for (int i = 0; i < a; i++) {
                ViewHolder c = m4275c(this.f4438h.mo4900b(i));
                if (!c.shouldIgnore() && (!c.isInvalid() || this.f4444n.mHasStableIds)) {
                    AbstractC1356f.m4395e(c);
                    c.getUnmodifiedPayloads();
                    this.f4439i.mo4874a(c, new AbstractC1356f.C1359c().mo4678a(c));
                    if (this.f4386G.f4536h && c.isUpdated() && !c.isRemoved() && !c.shouldIgnore() && !c.isInvalid()) {
                        this.f4439i.mo4873a(m4279e(c), c);
                    }
                }
            }
        }
        if (this.f4386G.f4539k) {
            m4255K();
            boolean z2 = this.f4386G.f4534f;
            this.f4386G.f4534f = false;
            this.f4445o.mo4337c(this.f4435e, this.f4386G);
            this.f4386G.f4534f = z2;
            for (int i2 = 0; i2 < this.f4438h.mo4894a(); i2++) {
                ViewHolder c2 = m4275c(this.f4438h.mo4900b(i2));
                if (!c2.shouldIgnore() && !this.f4439i.mo4878b(c2)) {
                    AbstractC1356f.m4395e(c2);
                    boolean hasAnyOfTheFlags = c2.hasAnyOfTheFlags(8192);
                    c2.getUnmodifiedPayloads();
                    AbstractC1356f.C1359c a2 = new AbstractC1356f.C1359c().mo4678a(c2);
                    if (hasAnyOfTheFlags) {
                        mo4400a(c2, a2);
                    } else {
                        this.f4439i.mo4877b(c2, a2);
                    }
                }
            }
            m4256L();
        } else {
            m4256L();
        }
        mo4419b(true);
        mo4406a(false);
        this.f4386G.f4532d = 2;
    }

    /* renamed from: b */
    public final void mo4415b(AbstractC1361h hVar) {
        mo4402a(hVar);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void setHasFixedSize(boolean z) {
        this.f4450t = z;
    }

    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setOnFlingListener(AbstractC1369l lVar) {
        this.f4427as = lVar;
    }

    public void setOnScrollListener(AbstractC1371n nVar) {
        this.f4433ay = nVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f4432ax = z;
    }

    public void setRecyclerListener(AbstractC1373p pVar) {
        this.f4446p = pVar;
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    class C1360g implements AbstractC1356f.AbstractC1358b {
        static {
            Covode.recordClassIndex(1494);
        }

        C1360g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1356f.AbstractC1358b
        /* renamed from: a */
        public final void mo4677a(ViewHolder viewHolder) {
            boolean z = true;
            viewHolder.setIsRecyclable(true);
            if (viewHolder.mShadowedHolder != null && viewHolder.mShadowingHolder == null) {
                viewHolder.mShadowedHolder = null;
            }
            viewHolder.mShadowingHolder = null;
            if (!viewHolder.shouldBeKeptAsChild()) {
                RecyclerView recyclerView = RecyclerView.this;
                View view = viewHolder.itemView;
                recyclerView.mo4476h();
                C1425f fVar = recyclerView.f4438h;
                int a = fVar.f4688a.mo4539a(view);
                if (a == -1) {
                    fVar.mo4901b(view);
                } else if (fVar.f4689b.mo4910c(a)) {
                    fVar.f4689b.mo4911d(a);
                    fVar.mo4901b(view);
                    fVar.f4688a.mo4540a(a);
                } else {
                    z = false;
                    recyclerView.mo4406a(!z);
                    if (!z && viewHolder.isTmpDetached()) {
                        RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
                        return;
                    }
                }
                ViewHolder c = RecyclerView.m4275c(view);
                recyclerView.f4435e.mo4765b(c);
                recyclerView.f4435e.mo4759a(c);
                recyclerView.mo4406a(!z);
                if (!z) {
                }
            }
        }
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public final void mo4418b(AbstractC1371n nVar) {
        List<AbstractC1371n> list = this.f4434az;
        if (list != null) {
            list.remove(nVar);
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* renamed from: e */
    public final ViewHolder mo4447e(int i) {
        return mo4392a(i, false);
    }

    public void setAccessibilityDelegateCompat(C1496z zVar) {
        this.f4390K = zVar;
        C0792v.m2747a(this, zVar);
    }

    public void setItemViewCacheSize(int i) {
        C1372o oVar = this.f4435e;
        oVar.f4508e = i;
        oVar.mo4763b();
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo2902a(z);
    }

    public void setViewCacheExtension(AbstractC1379t tVar) {
        this.f4435e.f4511h = tVar;
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public static class C1355e {
        static {
            Covode.recordClassIndex(1489);
        }

        /* renamed from: a */
        protected static EdgeEffect m4393a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: c */
    static ViewHolder m4275c(View view) {
        if (view == null) {
            return null;
        }
        return ((C1367j) view.getLayoutParams()).f4500c;
    }

    /* renamed from: d */
    public static int m4277d(View view) {
        ViewHolder c = m4275c(view);
        if (c != null) {
            return c.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    /* renamed from: e */
    public static int m4278e(View view) {
        ViewHolder c = m4275c(view);
        if (c != null) {
            return c.getLayoutPosition();
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo4416b(AbstractC1368k kVar) {
        List<AbstractC1368k> list = this.f4456z;
        if (list != null) {
            list.remove(kVar);
        }
    }

    public void setAdapter(AbstractC1350a aVar) {
        setLayoutFrozen(false);
        m4265a(aVar, false, true);
        mo4426c(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(AbstractC1354d dVar) {
        boolean z;
        if (dVar != this.f4399aB) {
            this.f4399aB = dVar;
            if (dVar != null) {
                z = true;
            } else {
                z = false;
            }
            setChildrenDrawingOrderEnabled(z);
        }
    }

    public void setEdgeEffectFactory(C1355e eVar) {
        C0697g.m2452a(eVar);
        this.f4414af = eVar;
        m4289w();
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo2906a(i, 0);
    }

    /* renamed from: e */
    private long m4279e(ViewHolder viewHolder) {
        if (this.f4444n.mHasStableIds) {
            return viewHolder.getItemId();
        }
        return (long) viewHolder.mPosition;
    }

    /* renamed from: b */
    public final View mo4411b(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4423c(int i) {
        if (this.f4445o != null) {
            setScrollState(2);
            this.f4445o.mo4363e(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C1367j) || !this.f4445o.mo4330a((C1367j) layoutParams)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo4433d(ViewHolder viewHolder) {
        if (viewHolder.hasAnyOfTheFlags(524) || !viewHolder.isBound()) {
            return -1;
        }
        return this.f4437g.mo4842c(viewHolder.mPosition);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f4448r.size();
        for (int i = 0; i < size; i++) {
            this.f4448r.get(i).onDraw(canvas, this, this.f4386G);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f4436f = savedState;
        super.onRestoreInstanceState(savedState.f3089d);
        requestLayout();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f4395U.size();
        for (int i = 0; i < size; i++) {
            this.f4395U.get(i).mo4750a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (mo4484l()) {
            if (accessibilityEvent != null) {
                int i2 = Build.VERSION.SDK_INT;
                int contentChangeTypes = accessibilityEvent.getContentChangeTypes();
                if (contentChangeTypes != 0) {
                    i = contentChangeTypes;
                }
            }
            this.f4410ab |= i;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f4440j) {
            m4289w();
        }
        this.f4440j = z;
        super.setClipToPadding(z);
        if (this.f4452v) {
            requestLayout();
        }
    }

    public void setItemAnimator(AbstractC1356f fVar) {
        AbstractC1356f fVar2 = this.f4382C;
        if (fVar2 != null) {
            fVar2.mo4672d();
            this.f4382C.f4466h = null;
        }
        this.f4382C = fVar;
        if (fVar != null) {
            fVar.f4466h = this.f4398aA;
        }
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        int i = Build.VERSION.SDK_INT;
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setRecycledViewPool(RecycledViewPool recycledViewPool) {
        C1372o oVar = this.f4435e;
        if (oVar.f4510g != null) {
            oVar.f4510g.detach();
        }
        oVar.f4510g = recycledViewPool;
        if (oVar.f4510g != null && RecyclerView.this.getAdapter() != null) {
            oVar.f4510g.attach();
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.f4426ar = viewConfiguration.getScaledTouchSlop();
        } else {
            this.f4426ar = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    /* renamed from: b */
    private void m4274b(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4420al) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f4420al = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f4424ap = x;
            this.f4422an = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f4425aq = y;
            this.f4423ao = y;
        }
    }

    /* renamed from: c */
    static void m4276c(ViewHolder viewHolder) {
        if (viewHolder.mNestedRecyclerView != null) {
            RecyclerView recyclerView = viewHolder.mNestedRecyclerView.get();
            while (recyclerView != null) {
                if (recyclerView != viewHolder.itemView) {
                    ViewParent parent = recyclerView.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    recyclerView = (View) parent;
                } else {
                    return;
                }
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }

    /* renamed from: g */
    static RecyclerView m4280g(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView g = m4280g(viewGroup.getChildAt(i));
            if (g != null) {
                return g;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final ViewHolder mo4451f(int i) {
        ViewHolder viewHolder = null;
        if (this.f4380A) {
            return null;
        }
        int b = this.f4438h.mo4899b();
        for (int i2 = 0; i2 < b; i2++) {
            ViewHolder c = m4275c(this.f4438h.mo4903c(i2));
            if (c != null && !c.isRemoved() && mo4433d(c) == i) {
                if (!this.f4438h.mo4905d(c.itemView)) {
                    return c;
                }
                viewHolder = c;
            }
        }
        return viewHolder;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC1362i iVar = this.f4445o;
        if (iVar != null) {
            return iVar.mo4316a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo4394a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo4477h(View view) {
        ViewHolder c = m4275c(view);
        AbstractC1350a aVar = this.f4444n;
        if (!(aVar == null || c == null)) {
            aVar.onViewDetachedFromWindow(c);
        }
        List<AbstractC1368k> list = this.f4456z;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4456z.get(size).mo4748b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.f4419ak) {
            this.f4419ak = i;
            if (i != 2) {
                mo5599q();
            }
            AbstractC1362i iVar = this.f4445o;
            if (iVar != null) {
                iVar.mo4723j(i);
            }
            AbstractC1371n nVar = this.f4433ay;
            if (nVar != null) {
                nVar.mo4753a(this, i);
            }
            List<AbstractC1371n> list = this.f4434az;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f4434az.get(size).mo4753a(this, i);
                }
            }
        }
    }

    public final void suppressLayout(boolean z) {
        if (z != this.f4454x) {
            mo4437d_("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f4454x = false;
                if (!(!this.f4453w || this.f4445o == null || this.f4444n == null)) {
                    requestLayout();
                }
                this.f4453w = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f4454x = true;
            this.f4409aa = true;
            mo4479i();
        }
    }

    /* renamed from: d */
    public final void mo4435d(int i) {
        AbstractC1362i iVar;
        if (!this.f4454x && (iVar = this.f4445o) != null) {
            iVar.mo4354a(this, this.f4386G, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d_ */
    public final void mo4437d_(String str) {
        if (mo4484l()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + mo4394a());
            }
            throw new IllegalStateException(str);
        } else if (this.f4413ae > 0) {
            new IllegalStateException(mo4394a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Rect mo4450f(View view) {
        C1367j jVar = (C1367j) view.getLayoutParams();
        if (!jVar.f4502e) {
            return jVar.f4501d;
        }
        if (this.f4386G.f4535g && (jVar.f4500c.isUpdated() || jVar.f4500c.isInvalid())) {
            return jVar.f4501d;
        }
        Rect rect = jVar.f4501d;
        rect.set(0, 0, 0, 0);
        int size = this.f4448r.size();
        for (int i = 0; i < size; i++) {
            this.f4442l.set(0, 0, 0, 0);
            this.f4448r.get(i).getItemOffsets(this.f4442l, view, this, this.f4386G);
            rect.left += this.f4442l.left;
            rect.top += this.f4442l.top;
            rect.right += this.f4442l.right;
            rect.bottom += this.f4442l.bottom;
        }
        jVar.f4502e = false;
        return rect;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC1362i iVar = this.f4445o;
        if (iVar != null) {
            return iVar.mo4317a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo4394a());
    }

    /* renamed from: b */
    public final void mo4413b(int i) {
        if (!this.f4454x) {
            mo4479i();
            AbstractC1362i iVar = this.f4445o;
            if (iVar != null) {
                iVar.mo4363e(i);
                awakenScrollBars();
            }
        }
    }

    /* renamed from: c */
    public final void mo4425c(AbstractC1361h hVar) {
        boolean z;
        AbstractC1362i iVar = this.f4445o;
        if (iVar != null) {
            iVar.mo4355a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f4448r.remove(hVar);
        if (this.f4448r.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
        }
        m4254J();
        requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (r2 == 0.0f) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        if (r1 != 0.0f) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        r4 = (int) (r1 * r14.f4430av);
        r3 = (int) (r2 * r14.f4431aw);
        r1 = r14.f4445o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r1 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r14.f4454x != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        r0 = r14.f4391L;
        r0[0] = 0;
        r0[1] = 0;
        r6 = r1.mo4366f();
        r5 = r14.f4445o.mo4368g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        if (r5 == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        r0 = r6 | 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
        m4282h(r0, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        if (r6 == 0) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        if (r5 == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        r10 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        if (mo4408a(r9, r10, r14.f4391L, r14.f4402aE, 1) == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        r1 = r14.f4391L;
        r4 = r4 - r1[0];
        r3 = r3 - r1[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0083, code lost:
        if (r6 == 0) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0085, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0086, code lost:
        if (r5 == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0088, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0089, code lost:
        m4271a(r1, r0, r15, 1);
        r0 = r14.f4384E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008e, code lost:
        if (r0 == null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0090, code lost:
        if (r4 != 0) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0092, code lost:
        if (r3 == 0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0094, code lost:
        r0.mo4966a(r14, r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0097, code lost:
        mo2900a(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009b, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009d, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009f, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a1, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a3, code lost:
        r0 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(android.view.MotionEvent r15) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public void setLayoutManager(AbstractC1362i iVar) {
        if (iVar != this.f4445o) {
            mo4479i();
            if (this.f4445o != null) {
                AbstractC1356f fVar = this.f4382C;
                if (fVar != null) {
                    fVar.mo4672d();
                }
                this.f4445o.mo4711c(this.f4435e);
                this.f4445o.mo4704b(this.f4435e);
                this.f4435e.mo4756a();
                if (this.f4449s) {
                    this.f4445o.mo4706b(this, this.f4435e);
                }
                this.f4445o.mo4696a((RecyclerView) null);
                this.f4445o = null;
            } else {
                this.f4435e.mo4756a();
            }
            C1425f fVar2 = this.f4438h;
            C1425f.C1426a aVar = fVar2.f4689b;
            while (true) {
                aVar.f4691a = 0;
                if (aVar.f4692b == null) {
                    break;
                }
                aVar = aVar.f4692b;
            }
            for (int size = fVar2.f4690c.size() - 1; size >= 0; size--) {
                fVar2.f4688a.mo4548d(fVar2.f4690c.get(size));
                fVar2.f4690c.remove(size);
            }
            fVar2.f4688a.mo4545b();
            this.f4445o = iVar;
            if (iVar != null) {
                if (iVar.f4490w == null) {
                    this.f4445o.mo4696a(this);
                    if (this.f4449s) {
                        this.f4445o.mo4705b(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + iVar + " is already attached to a RecyclerView:" + iVar.f4490w.mo4394a());
                }
            }
            this.f4435e.mo4763b();
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4426c(boolean z) {
        this.f4381B = z | this.f4381B;
        this.f4380A = true;
        m4257M();
    }

    public void draw(Canvas canvas) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        super.draw(canvas);
        int size = this.f4448r.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            this.f4448r.get(i3).onDrawOver(canvas, this, this.f4386G);
        }
        EdgeEffect edgeEffect = this.f4415ag;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            if (this.f4440j) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i2), 0.0f);
            EdgeEffect edgeEffect2 = this.f4415ag;
            if (edgeEffect2 == null || !edgeEffect2.draw(canvas)) {
                z = false;
            } else {
                z = true;
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f4416ah;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f4440j) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f4416ah;
            if (edgeEffect4 == null || !edgeEffect4.draw(canvas)) {
                z3 = false;
            } else {
                z3 = true;
            }
            z |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f4417ai;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f4440j) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) i, (float) (-width));
            EdgeEffect edgeEffect6 = this.f4417ai;
            if (edgeEffect6 == null || !edgeEffect6.draw(canvas)) {
                z2 = false;
            } else {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f4418aj;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4440j) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f4418aj;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save4);
        }
        if (z || (this.f4382C != null && this.f4448r.size() > 0 && this.f4382C.mo4668b())) {
            C0792v.m2764c(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b3, code lost:
        if (r4 != false) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d0, code lost:
        if (r6 != 0) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d2, code lost:
        setScrollState(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0156, code lost:
        if (r11 == false) goto L_0x00d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
        // Method dump skipped, instructions count: 478
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    public final void mo4417b(AbstractC1370m mVar) {
        this.f4395U.remove(mVar);
        if (this.f4396V == mVar) {
            this.f4396V = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo4419b(boolean z) {
        int i = this.f4412ad - 1;
        this.f4412ad = i;
        if (i <= 0) {
            this.f4412ad = 0;
            if (z) {
                m4292z();
                m4258N();
            }
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.a9l);
    }

    /* renamed from: h */
    private boolean m4282h(int i, int i2) {
        return getScrollingChildHelper().mo2906a(i, i2);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo2903a(f, f2);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        AbstractC1354d dVar = this.f4399aB;
        if (dVar == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return dVar.mo4662a(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo4484l()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* renamed from: g */
    private boolean mo111273g(int i, int i2) {
        m4270a(this.f4400aC);
        int[] iArr = this.f4400aC;
        if (iArr[0] == i && iArr[1] == i2) {
            return false;
        }
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f4445o.mo4728q() && !mo4484l() && view2 != null) {
            m4263a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    /* renamed from: a */
    public static void m4262a(View view, Rect rect) {
        C1367j jVar = (C1367j) view.getLayoutParams();
        Rect rect2 = jVar.f4501d;
        rect.set((view.getLeft() - rect2.left) - jVar.leftMargin, (view.getTop() - rect2.top) - jVar.topMargin, view.getRight() + rect2.right + jVar.rightMargin, view.getBottom() + rect2.bottom + jVar.bottomMargin);
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        ViewHolder c = m4275c(view);
        if (c != null) {
            if (c.isTmpDetached()) {
                c.clearTmpDetachFlag();
            } else if (!c.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + c + mo4394a());
            }
        }
        view.clearAnimation();
        mo4477h(view);
        super.removeDetachedView(view, z);
    }

    public void scrollBy(int i, int i2) {
        AbstractC1362i iVar = this.f4445o;
        if (iVar != null && !this.f4454x) {
            boolean f = iVar.mo4366f();
            boolean g = this.f4445o.mo4368g();
            if (f || g) {
                if (!f) {
                    i = 0;
                }
                if (!g) {
                    i2 = 0;
                }
                m4271a(i, i2, (MotionEvent) null, 0);
            }
        }
    }

    /* renamed from: a */
    private static Object m4259a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4424c(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f4415ag;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f4415ag.onRelease();
            z = this.f4415ag.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4417ai;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f4417ai.onRelease();
            z |= this.f4417ai.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4416ah;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f4416ah.onRelease();
            z |= this.f4416ah.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4418aj;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f4418aj.onRelease();
            z |= this.f4418aj.isFinished();
        }
        if (z) {
            C0792v.m2764c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo4449e(int i, int i2) {
        setMeasuredDimension(AbstractC1362i.m4413a(i, getPaddingLeft() + getPaddingRight(), C0792v.m2774h(this)), AbstractC1362i.m4413a(i2, getPaddingTop() + getPaddingBottom(), C0792v.m2775i(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo4436d(int i, int i2) {
        if (i < 0) {
            mo63602s();
            if (this.f4415ag.isFinished()) {
                this.f4415ag.onAbsorb(-i);
            }
        } else if (i > 0) {
            m4286t();
            if (this.f4417ai.isFinished()) {
                this.f4417ai.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            m4287u();
            if (this.f4416ah.isFinished()) {
                this.f4416ah.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            m4288v();
            if (this.f4418aj.isFinished()) {
                this.f4418aj.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            C0792v.m2764c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo4453f(int i, int i2) {
        this.f4413ae++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        AbstractC1371n nVar = this.f4433ay;
        if (nVar != null) {
            nVar.mo4754a(this, i, i2);
        }
        List<AbstractC1371n> list = this.f4434az;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4434az.get(size).mo4754a(this, i, i2);
            }
        }
        this.f4413ae--;
    }

    public void onMeasure(int i, int i2) {
        AbstractC1362i iVar = this.f4445o;
        if (iVar == null) {
            mo4449e(i, i2);
            return;
        }
        boolean z = false;
        if (iVar.mo4375w_()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f4445o.mo4694a(this.f4435e, this.f4386G, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f4405aH = z;
            if (!z && this.f4444n != null) {
                if (this.f4386G.f4532d == 1) {
                    m4251G();
                }
                this.f4445o.mo4700a_(i, i2);
                this.f4386G.f4537i = true;
                m4252H();
                this.f4445o.mo4709c(i, i2);
                if (this.f4445o.mo4376z_()) {
                    this.f4445o.mo4700a_(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f4386G.f4537i = true;
                    m4252H();
                    this.f4445o.mo4709c(i, i2);
                }
                this.f4406aI = getMeasuredWidth();
                this.f4407aJ = getMeasuredHeight();
            }
        } else if (this.f4450t) {
            this.f4445o.mo4694a(this.f4435e, this.f4386G, i, i2);
        } else {
            if (this.f4455y) {
                mo4476h();
                mo4482j();
                m4246B();
                mo4419b(true);
                if (this.f4386G.f4539k) {
                    this.f4386G.f4535g = true;
                } else {
                    this.f4437g.mo4845e();
                    this.f4386G.f4535g = false;
                }
                this.f4455y = false;
                mo4406a(false);
            } else if (this.f4386G.f4539k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC1350a aVar = this.f4444n;
            if (aVar != null) {
                this.f4386G.f4533e = aVar.getItemCount();
            } else {
                this.f4386G.f4533e = 0;
            }
            mo4476h();
            this.f4445o.mo4694a(this.f4435e, this.f4386G, i, i2);
            mo4406a(false);
            this.f4386G.f4535g = false;
        }
    }

    /* renamed from: a */
    private void m4261a(long j, ViewHolder viewHolder) {
        int a = this.f4438h.mo4894a();
        for (int i = 0; i < a; i++) {
            ViewHolder c = m4275c(this.f4438h.mo4900b(i));
            if (c != viewHolder && m4279e(c) == j) {
                AbstractC1350a aVar = this.f4444n;
                if (aVar == null || !aVar.mHasStableIds) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + c + " \n View Holder 2:" + viewHolder + mo4394a());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + c + " \n View Holder 2:" + viewHolder + mo4394a());
            }
        }
        mo4394a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0169, code lost:
        if (r11 > 0) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01b3, code lost:
        if (r9 > 0) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01b7, code lost:
        if (r11 < 0) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01bb, code lost:
        if (r9 < 0) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01c4, code lost:
        if ((r9 * r10) <= 0) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01cd, code lost:
        if ((r9 * r10) >= 0) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r1 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006a, code lost:
        if (r1 != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006c, code lost:
        mo4455g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0073, code lost:
        if (mo4411b(r13) != null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0075, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0088, code lost:
        mo4476h();
        r12.f4445o.mo4314a(r13, r14, r12.f4435e, r12.f4386G);
        mo4406a(false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r13, int r14) {
        /*
        // Method dump skipped, instructions count: 494
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* renamed from: a */
    private void m4263a(View view, View view2) {
        View view3;
        boolean z;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.f4442l.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1367j) {
            C1367j jVar = (C1367j) layoutParams;
            if (!jVar.f4502e) {
                Rect rect = jVar.f4501d;
                this.f4442l.left -= rect.left;
                this.f4442l.right += rect.right;
                this.f4442l.top -= rect.top;
                this.f4442l.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f4442l);
            offsetRectIntoDescendantCoords(view, this.f4442l);
        }
        AbstractC1362i iVar = this.f4445o;
        Rect rect2 = this.f4442l;
        boolean z2 = !this.f4452v;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        iVar.mo4698a(this, view, rect2, z2, z);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static abstract class AbstractC1361h {
        static {
            Covode.recordClassIndex(1495);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, C1378s sVar) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1378s sVar) {
            onDrawOver(canvas, recyclerView);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1378s sVar) {
            getItemOffsets(rect, ((C1367j) view.getLayoutParams()).f4500c.getLayoutPosition(), recyclerView);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo2904a(f, f2, z);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f4445o.mo4698a(this, view, rect, z, false);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public static abstract class AbstractC1353c {
        static {
            Covode.recordClassIndex(1487);
        }

        /* renamed from: a */
        public void mo4655a() {
        }

        /* renamed from: a */
        public void mo4656a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo4657a(int i, int i2, int i3) {
        }

        /* renamed from: b */
        public void mo4659b() {
        }

        /* renamed from: b */
        public void mo4660b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo4661c(int i, int i2) {
        }

        /* renamed from: a */
        public void mo4658a(int i, int i2, Object obj) {
            mo4656a(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo4414b(int i, int i2, boolean z) {
        int i3 = i + i2;
        int b = this.f4438h.mo4899b();
        for (int i4 = 0; i4 < b; i4++) {
            ViewHolder c = m4275c(this.f4438h.mo4903c(i4));
            if (c != null && !c.shouldIgnore()) {
                if (c.mPosition >= i3) {
                    c.offsetPosition(-i2, z);
                    this.f4386G.f4534f = true;
                } else if (c.mPosition >= i) {
                    c.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.f4386G.f4534f = true;
                }
            }
        }
        C1372o oVar = this.f4435e;
        for (int size = oVar.f4506c.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = oVar.f4506c.get(size);
            if (viewHolder != null) {
                if (viewHolder.mPosition >= i3) {
                    viewHolder.offsetPosition(-i2, z);
                } else if (viewHolder.mPosition >= i) {
                    viewHolder.addFlags(8);
                    oVar.mo4770d(size);
                }
            }
        }
        requestLayout();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        RunnableC1461m.C1463a aVar;
        float a;
        float a2;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        char c;
        boolean z3;
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        Object[] objArr;
        this.f4393S = new C1374q();
        this.f4435e = new C1372o();
        this.f4439i = new C1406af();
        this.f4441k = new Runnable() {
            /* class androidx.recyclerview.widget.RecyclerView.RunnableC13421 */

            static {
                Covode.recordClassIndex(1472);
            }

            public final void run() {
                if (RecyclerView.this.f4452v && !RecyclerView.this.isLayoutRequested()) {
                    if (!RecyclerView.this.f4449s) {
                        RecyclerView.this.requestLayout();
                    } else if (RecyclerView.this.f4454x) {
                        RecyclerView.this.f4453w = true;
                    } else {
                        RecyclerView.this.mo4455g();
                    }
                }
            }
        };
        this.f4442l = new Rect();
        this.f4394T = new Rect();
        this.f4443m = new RectF();
        this.f4447q = new ArrayList();
        this.f4448r = new ArrayList<>();
        this.f4395U = new ArrayList<>();
        this.f4397W = 0;
        this.f4380A = false;
        this.f4381B = false;
        this.f4412ad = 0;
        this.f4413ae = 0;
        this.f4414af = new C1355e();
        this.f4382C = new C1434i();
        this.f4419ak = 0;
        this.f4420al = -1;
        this.f4430av = Float.MIN_VALUE;
        this.f4431aw = Float.MIN_VALUE;
        this.f4432ax = true;
        this.f4383D = new RunnableC1380u();
        if (f4379d) {
            aVar = new RunnableC1461m.C1463a();
        } else {
            aVar = null;
        }
        this.f4385F = aVar;
        this.f4386G = new C1378s();
        this.f4387H = false;
        this.f4388I = false;
        this.f4398aA = new C1360g();
        this.f4389J = false;
        this.f4400aC = new int[2];
        this.f4402aE = new int[2];
        this.f4403aF = new int[2];
        this.f4391L = new int[2];
        this.f4392M = new ArrayList();
        this.f4404aG = new Runnable() {
            /* class androidx.recyclerview.widget.RecyclerView.RunnableC13432 */

            static {
                Covode.recordClassIndex(1473);
            }

            public final void run() {
                if (RecyclerView.this.f4382C != null) {
                    RecyclerView.this.f4382C.mo4663a();
                }
                RecyclerView.this.f4389J = false;
            }
        };
        this.f4406aI = 0;
        this.f4407aJ = 0;
        this.f4408aK = new C1406af.AbstractC1408b() {
            /* class androidx.recyclerview.widget.RecyclerView.C13454 */

            static {
                Covode.recordClassIndex(1475);
            }

            @Override // androidx.recyclerview.widget.C1406af.AbstractC1408b
            /* renamed from: a */
            public final void mo4534a(ViewHolder viewHolder) {
                RecyclerView.this.f4445o.mo4691a(viewHolder.itemView, RecyclerView.this.f4435e);
            }

            @Override // androidx.recyclerview.widget.C1406af.AbstractC1408b
            /* renamed from: a */
            public final void mo4535a(ViewHolder viewHolder, AbstractC1356f.C1359c cVar, AbstractC1356f.C1359c cVar2) {
                RecyclerView.this.f4435e.mo4765b(viewHolder);
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mo4399a(viewHolder);
                viewHolder.setIsRecyclable(false);
                if (recyclerView.f4382C.mo4665a(viewHolder, cVar, cVar2)) {
                    recyclerView.mo4485m();
                }
            }

            @Override // androidx.recyclerview.widget.C1406af.AbstractC1408b
            /* renamed from: b */
            public final void mo4536b(ViewHolder viewHolder, AbstractC1356f.C1359c cVar, AbstractC1356f.C1359c cVar2) {
                RecyclerView recyclerView = RecyclerView.this;
                viewHolder.setIsRecyclable(false);
                if (recyclerView.f4382C.mo4669b(viewHolder, cVar, cVar2)) {
                    recyclerView.mo4485m();
                }
            }

            @Override // androidx.recyclerview.widget.C1406af.AbstractC1408b
            /* renamed from: c */
            public final void mo4537c(ViewHolder viewHolder, AbstractC1356f.C1359c cVar, AbstractC1356f.C1359c cVar2) {
                viewHolder.setIsRecyclable(false);
                if (RecyclerView.this.f4380A) {
                    if (RecyclerView.this.f4382C.mo4664a(viewHolder, viewHolder, cVar, cVar2)) {
                        RecyclerView.this.mo4485m();
                    }
                } else if (RecyclerView.this.f4382C.mo4671c(viewHolder, cVar, cVar2)) {
                    RecyclerView.this.mo4485m();
                }
            }
        };
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4426ar = viewConfiguration.getScaledTouchSlop();
        if (Build.VERSION.SDK_INT >= 26) {
            a = viewConfiguration.getScaledHorizontalScrollFactor();
        } else {
            a = C0802w.m2809a(viewConfiguration, context);
        }
        this.f4430av = a;
        if (Build.VERSION.SDK_INT >= 26) {
            a2 = viewConfiguration.getScaledVerticalScrollFactor();
        } else {
            a2 = C0802w.m2809a(viewConfiguration, context);
        }
        this.f4431aw = a2;
        this.f4428at = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4429au = viewConfiguration.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        this.f4382C.f4466h = this.f4398aA;
        this.f4437g = new C1387a(new C1387a.AbstractC1388a() {
            /* class androidx.recyclerview.widget.RecyclerView.C13476 */

            static {
                Covode.recordClassIndex(1477);
            }

            @Override // androidx.recyclerview.widget.C1387a.AbstractC1388a
            /* renamed from: a */
            public final void mo4552a(C1387a.C1389b bVar) {
                m4367c(bVar);
            }

            @Override // androidx.recyclerview.widget.C1387a.AbstractC1388a
            /* renamed from: b */
            public final void mo4554b(C1387a.C1389b bVar) {
                m4367c(bVar);
            }

            @Override // androidx.recyclerview.widget.C1387a.AbstractC1388a
            /* renamed from: a */
            public final ViewHolder mo4549a(int i) {
                ViewHolder a = RecyclerView.this.mo4392a(i, true);
                if (a != null && !RecyclerView.this.f4438h.mo4905d(a.itemView)) {
                    return a;
                }
                return null;
            }

            /* renamed from: c */
            private void m4367c(C1387a.C1389b bVar) {
                int i = bVar.f4617a;
                if (i == 1) {
                    RecyclerView.this.f4445o.mo4326a(RecyclerView.this, bVar.f4618b, bVar.f4620d);
                } else if (i == 2) {
                    RecyclerView.this.f4445o.mo4335b(RecyclerView.this, bVar.f4618b, bVar.f4620d);
                } else if (i == 4) {
                    RecyclerView.this.f4445o.mo4328a(RecyclerView.this, bVar.f4618b, bVar.f4620d, bVar.f4619c);
                } else if (i == 8) {
                    RecyclerView.this.f4445o.mo4327a(RecyclerView.this, bVar.f4618b, bVar.f4620d, 1);
                }
            }

            @Override // androidx.recyclerview.widget.C1387a.AbstractC1388a
            /* renamed from: b */
            public final void mo4553b(int i, int i2) {
                RecyclerView.this.mo4414b(i, i2, false);
                RecyclerView.this.f4387H = true;
            }

            @Override // androidx.recyclerview.widget.C1387a.AbstractC1388a
            /* renamed from: a */
            public final void mo4550a(int i, int i2) {
                RecyclerView.this.mo4414b(i, i2, true);
                RecyclerView.this.f4387H = true;
                RecyclerView.this.f4386G.f4531c += i2;
            }

            @Override // androidx.recyclerview.widget.C1387a.AbstractC1388a
            /* renamed from: d */
            public final void mo4556d(int i, int i2) {
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                RecyclerView recyclerView = RecyclerView.this;
                int b = recyclerView.f4438h.mo4899b();
                int i8 = -1;
                if (i < i2) {
                    i4 = i;
                    i3 = i2;
                    i5 = -1;
                } else {
                    i3 = i;
                    i4 = i2;
                    i5 = 1;
                }
                for (int i9 = 0; i9 < b; i9++) {
                    ViewHolder c = RecyclerView.m4275c(recyclerView.f4438h.mo4903c(i9));
                    if (c != null && c.mPosition >= i4 && c.mPosition <= i3) {
                        if (c.mPosition == i) {
                            c.offsetPosition(i2 - i, false);
                        } else {
                            c.offsetPosition(i5, false);
                        }
                        recyclerView.f4386G.f4534f = true;
                    }
                }
                C1372o oVar = recyclerView.f4435e;
                if (i < i2) {
                    i7 = i;
                    i6 = i2;
                } else {
                    i6 = i;
                    i7 = i2;
                    i8 = 1;
                }
                int size = oVar.f4506c.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ViewHolder viewHolder = oVar.f4506c.get(i10);
                    if (viewHolder != null && viewHolder.mPosition >= i7 && viewHolder.mPosition <= i6) {
                        if (viewHolder.mPosition == i) {
                            viewHolder.offsetPosition(i2 - i, false);
                        } else {
                            viewHolder.offsetPosition(i8, false);
                        }
                    }
                }
                recyclerView.requestLayout();
                RecyclerView.this.f4387H = true;
            }

            @Override // androidx.recyclerview.widget.C1387a.AbstractC1388a
            /* renamed from: c */
            public final void mo4555c(int i, int i2) {
                RecyclerView recyclerView = RecyclerView.this;
                int b = recyclerView.f4438h.mo4899b();
                for (int i3 = 0; i3 < b; i3++) {
                    ViewHolder c = RecyclerView.m4275c(recyclerView.f4438h.mo4903c(i3));
                    if (c != null && !c.shouldIgnore() && c.mPosition >= i) {
                        c.offsetPosition(i2, false);
                        recyclerView.f4386G.f4534f = true;
                    }
                }
                C1372o oVar = recyclerView.f4435e;
                int size = oVar.f4506c.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ViewHolder viewHolder = oVar.f4506c.get(i4);
                    if (viewHolder != null && viewHolder.mPosition >= i) {
                        viewHolder.offsetPosition(i2, false);
                    }
                }
                recyclerView.requestLayout();
                RecyclerView.this.f4387H = true;
            }

            @Override // androidx.recyclerview.widget.C1387a.AbstractC1388a
            /* renamed from: a */
            public final void mo4551a(int i, int i2, Object obj) {
                int i3;
                RecyclerView recyclerView = RecyclerView.this;
                int b = recyclerView.f4438h.mo4899b();
                int i4 = i2 + i;
                for (int i5 = 0; i5 < b; i5++) {
                    View c = recyclerView.f4438h.mo4903c(i5);
                    ViewHolder c2 = RecyclerView.m4275c(c);
                    if (c2 != null && !c2.shouldIgnore() && c2.mPosition >= i && c2.mPosition < i4) {
                        c2.addFlags(2);
                        c2.addChangePayload(obj);
                        ((C1367j) c.getLayoutParams()).f4502e = true;
                    }
                }
                C1372o oVar = recyclerView.f4435e;
                for (int size = oVar.f4506c.size() - 1; size >= 0; size--) {
                    ViewHolder viewHolder = oVar.f4506c.get(size);
                    if (viewHolder != null && (i3 = viewHolder.mPosition) >= i && i3 < i4) {
                        viewHolder.addFlags(2);
                        oVar.mo4770d(size);
                    }
                }
                RecyclerView.this.f4388I = true;
            }
        });
        this.f4438h = new C1425f(new C1425f.AbstractC1427b() {
            /* class androidx.recyclerview.widget.RecyclerView.C13465 */

            static {
                Covode.recordClassIndex(1476);
            }

            @Override // androidx.recyclerview.widget.C1425f.AbstractC1427b
            /* renamed from: a */
            public final int mo4538a() {
                return RecyclerView.this.getChildCount();
            }

            @Override // androidx.recyclerview.widget.C1425f.AbstractC1427b
            /* renamed from: b */
            public final void mo4545b() {
                int childCount = RecyclerView.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View b = mo4543b(i);
                    RecyclerView.this.mo4477h(b);
                    b.clearAnimation();
                }
                RecyclerView.this.removeAllViews();
            }

            @Override // androidx.recyclerview.widget.C1425f.AbstractC1427b
            /* renamed from: b */
            public final View mo4543b(int i) {
                return RecyclerView.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.C1425f.AbstractC1427b
            /* renamed from: a */
            public final int mo4539a(View view) {
                return RecyclerView.this.indexOfChild(view);
            }

            @Override // androidx.recyclerview.widget.C1425f.AbstractC1427b
            /* renamed from: b */
            public final ViewHolder mo4544b(View view) {
                return RecyclerView.m4275c(view);
            }

            @Override // androidx.recyclerview.widget.C1425f.AbstractC1427b
            /* renamed from: c */
            public final void mo4547c(View view) {
                ViewHolder c = RecyclerView.m4275c(view);
                if (c != null) {
                    c.onEnteredHiddenState(RecyclerView.this);
                }
            }

            @Override // androidx.recyclerview.widget.C1425f.AbstractC1427b
            /* renamed from: d */
            public final void mo4548d(View view) {
                ViewHolder c = RecyclerView.m4275c(view);
                if (c != null) {
                    c.onLeftHiddenState(RecyclerView.this);
                }
            }

            @Override // androidx.recyclerview.widget.C1425f.AbstractC1427b
            /* renamed from: a */
            public final void mo4540a(int i) {
                View childAt = RecyclerView.this.getChildAt(i);
                if (childAt != null) {
                    RecyclerView.this.mo4477h(childAt);
                    childAt.clearAnimation();
                }
                RecyclerView.this.removeViewAt(i);
            }

            @Override // androidx.recyclerview.widget.C1425f.AbstractC1427b
            /* renamed from: c */
            public final void mo4546c(int i) {
                ViewHolder c;
                View b = mo4543b(i);
                if (!(b == null || (c = RecyclerView.m4275c(b)) == null)) {
                    if (!c.isTmpDetached() || c.shouldIgnore()) {
                        c.addFlags(256);
                    } else {
                        throw new IllegalArgumentException("called detach on an already detached child " + c + RecyclerView.this.mo4394a());
                    }
                }
                RecyclerView.this.detachViewFromParent((RecyclerView) i);
            }

            @Override // androidx.recyclerview.widget.C1425f.AbstractC1427b
            /* renamed from: a */
            public final void mo4541a(View view, int i) {
                RecyclerView.this.addView(view, i);
                RecyclerView recyclerView = RecyclerView.this;
                ViewHolder c = RecyclerView.m4275c(view);
                if (!(recyclerView.f4444n == null || c == null)) {
                    recyclerView.f4444n.onViewAttachedToWindow(c);
                }
                if (recyclerView.f4456z != null) {
                    for (int size = recyclerView.f4456z.size() - 1; size >= 0; size--) {
                        recyclerView.f4456z.get(size).mo4747a(view);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.C1425f.AbstractC1427b
            /* renamed from: a */
            public final void mo4542a(View view, int i, ViewGroup.LayoutParams layoutParams) {
                ViewHolder c = RecyclerView.m4275c(view);
                if (c != null) {
                    if (c.isTmpDetached() || c.shouldIgnore()) {
                        c.clearTmpDetachFlag();
                    } else {
                        throw new IllegalArgumentException("Called attach on a child which is not detached: " + c + RecyclerView.this.mo4394a());
                    }
                }
                RecyclerView.this.attachViewToParent(view, i, layoutParams);
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            i2 = getImportantForAutofill();
        } else {
            i2 = 0;
        }
        if (i2 == 0 && Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(8);
        }
        if (C0792v.m2766d(this) == 0) {
            C0792v.m2740a((View) this, 1);
        }
        this.f4411ac = (AccessibilityManager) m4259a(getContext(), "accessibility");
        setAccessibilityDelegateCompat(new C1496z(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948, 16842987, 16842993, R.attr.tu, R.attr.tv, R.attr.tw, R.attr.tx, R.attr.ty, R.attr.z_, R.attr.a9r, R.attr.acx, R.attr.aev}, i, 0);
        C0792v.m2742a(this, context, new int[]{16842948, 16842987, 16842993, R.attr.tu, R.attr.tv, R.attr.tw, R.attr.tx, R.attr.ty, R.attr.z_, R.attr.a9r, R.attr.acx, R.attr.aev}, attributeSet, obtainStyledAttributes, i);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f4440j = obtainStyledAttributes.getBoolean(1, true);
        boolean z4 = obtainStyledAttributes.getBoolean(3, false);
        this.f4451u = z4;
        if (z4) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + mo4394a());
            }
            Resources resources = getContext().getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.jo);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.jq);
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.jp);
            i3 = 4;
            c = 2;
            z2 = true;
            new C1456l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelOffset);
        } else {
            i3 = 4;
            z2 = true;
            c = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(trim, false, classLoader).asSubclass(AbstractC1362i.class);
                    try {
                        constructor = asSubclass.getConstructor(f4375R);
                        objArr = new Object[i3];
                        objArr[0] = context;
                        char c2 = z2 ? 1 : 0;
                        char c3 = z2 ? 1 : 0;
                        char c4 = z2 ? 1 : 0;
                        objArr[c2] = attributeSet;
                        objArr[c] = Integer.valueOf(i);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e2);
                        }
                    }
                    constructor.setAccessible(z2);
                    setLayoutManager((AbstractC1362i) constructor.newInstance(objArr));
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e7);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            int[] iArr = f4372O;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
            C0792v.m2742a(this, context, iArr, attributeSet, obtainStyledAttributes2, i);
            z3 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        } else {
            z3 = true;
        }
        setNestedScrollingEnabled(z3);
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2587f());
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo2908a(i, i2, iArr, iArr2);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            m4289w();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4260a(float r6, float r7, float r8, float r9) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4260a(float, float, float, float):void");
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo2907a(i, i2, i3, i4, iArr);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0654g.m2391a("RV OnLayout");
        m4247C();
        C0654g.m2390a();
        this.f4452v = true;
    }

    /* renamed from: a */
    private void m4264a(ViewHolder viewHolder, ViewHolder viewHolder2, AbstractC1356f.C1359c cVar, AbstractC1356f.C1359c cVar2, boolean z, boolean z2) {
        viewHolder.setIsRecyclable(false);
        if (z) {
            mo4399a(viewHolder);
        }
        if (viewHolder != viewHolder2) {
            if (z2) {
                mo4399a(viewHolder2);
            }
            viewHolder.mShadowedHolder = viewHolder2;
            mo4399a(viewHolder);
            this.f4435e.mo4765b(viewHolder);
            viewHolder2.setIsRecyclable(false);
            viewHolder2.mShadowingHolder = viewHolder;
        }
        if (this.f4382C.mo4664a(viewHolder, viewHolder2, cVar, cVar2)) {
            mo4485m();
        }
    }
}
