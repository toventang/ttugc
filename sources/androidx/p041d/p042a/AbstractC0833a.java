package androidx.p041d.p042a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import androidx.p041d.p042a.C0836b;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.d.a.a */
public abstract class AbstractC0833a extends BaseAdapter implements Filterable, C0836b.AbstractC0837a {

    /* renamed from: b */
    protected boolean f3090b = false;

    /* renamed from: c */
    protected boolean f3091c = true;

    /* renamed from: d */
    protected Cursor f3092d = null;

    /* renamed from: e */
    protected Context f3093e;

    /* renamed from: f */
    protected int f3094f;

    /* renamed from: g */
    protected C0834a f3095g;

    /* renamed from: h */
    protected DataSetObserver f3096h;

    /* renamed from: i */
    protected C0836b f3097i;

    /* renamed from: j */
    public FilterQueryProvider f3098j;

    static {
        Covode.recordClassIndex(917);
    }

    /* renamed from: a */
    public abstract View mo1808a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo1810a(View view, Cursor cursor);

    public boolean hasStableIds() {
        return true;
    }

    @Override // androidx.p041d.p042a.C0836b.AbstractC0837a
    /* renamed from: a */
    public final Cursor mo3045a() {
        return this.f3092d;
    }

    /* renamed from: androidx.d.a.a$b */
    class C0835b extends DataSetObserver {
        static {
            Covode.recordClassIndex(919);
        }

        public final void onChanged() {
            AbstractC0833a.this.f3090b = true;
            AbstractC0833a.this.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            AbstractC0833a.this.f3090b = false;
            AbstractC0833a.this.notifyDataSetInvalidated();
        }

        C0835b() {
        }
    }

    public int getCount() {
        Cursor cursor;
        if (!this.f3090b || (cursor = this.f3092d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public Filter getFilter() {
        if (this.f3097i == null) {
            this.f3097i = new C0836b(this);
        }
        return this.f3097i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo3047b() {
        Cursor cursor;
        if (this.f3091c && (cursor = this.f3092d) != null && !cursor.isClosed()) {
            this.f3090b = this.f3092d.requery();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.d.a.a$a */
    public class C0834a extends ContentObserver {
        static {
            Covode.recordClassIndex(918);
        }

        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean z) {
            AbstractC0833a.this.mo3047b();
        }

        C0834a() {
            super(new Handler());
        }
    }

    @Override // androidx.p041d.p042a.C0836b.AbstractC0837a
    /* renamed from: a */
    public Cursor mo1807a(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f3098j;
        if (filterQueryProvider != null) {
            return filterQueryProvider.runQuery(charSequence);
        }
        return this.f3092d;
    }

    @Override // androidx.p041d.p042a.C0836b.AbstractC0837a
    /* renamed from: b */
    public CharSequence mo1811b(Cursor cursor) {
        if (cursor == null) {
            return "";
        }
        return cursor.toString();
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f3090b || (cursor = this.f3092d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f3092d;
    }

    public AbstractC0833a(Context context) {
        this.f3093e = context;
        this.f3094f = -1;
        this.f3095g = new C0834a();
        this.f3096h = new C0835b();
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f3090b || (cursor = this.f3092d) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f3092d.getLong(this.f3094f);
    }

    @Override // androidx.p041d.p042a.C0836b.AbstractC0837a
    /* renamed from: a */
    public void mo1809a(Cursor cursor) {
        Cursor cursor2 = this.f3092d;
        if (cursor != cursor2) {
            if (cursor2 != null) {
                C0834a aVar = this.f3095g;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                DataSetObserver dataSetObserver = this.f3096h;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f3092d = cursor;
            if (cursor != null) {
                C0834a aVar2 = this.f3095g;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                DataSetObserver dataSetObserver2 = this.f3096h;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f3094f = cursor.getColumnIndexOrThrow("_id");
                this.f3090b = true;
                notifyDataSetChanged();
            } else {
                this.f3094f = -1;
                this.f3090b = false;
                notifyDataSetInvalidated();
            }
            if (cursor2 != null) {
                cursor2.close();
            }
        }
    }

    /* renamed from: b */
    public View mo3046b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo1808a(context, cursor, viewGroup);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f3090b) {
            return null;
        }
        this.f3092d.moveToPosition(i);
        if (view == null) {
            view = mo3046b(this.f3093e, this.f3092d, viewGroup);
        }
        mo1810a(view, this.f3092d);
        return view;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f3090b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f3092d.moveToPosition(i)) {
            if (view == null) {
                view = mo1808a(this.f3093e, this.f3092d, viewGroup);
            }
            mo1810a(view, this.f3092d);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position ".concat(String.valueOf(i)));
        }
    }
}
