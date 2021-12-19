package androidx.p041d.p042a;

import android.database.Cursor;
import android.widget.Filter;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.d.a.b */
final class C0836b extends Filter {

    /* renamed from: a */
    AbstractC0837a f3101a;

    /* renamed from: androidx.d.a.b$a */
    interface AbstractC0837a {
        static {
            Covode.recordClassIndex(921);
        }

        /* renamed from: a */
        Cursor mo3045a();

        /* renamed from: a */
        Cursor mo1807a(CharSequence charSequence);

        /* renamed from: a */
        void mo1809a(Cursor cursor);

        /* renamed from: b */
        CharSequence mo1811b(Cursor cursor);
    }

    static {
        Covode.recordClassIndex(920);
    }

    C0836b(AbstractC0837a aVar) {
        this.f3101a = aVar;
    }

    public final CharSequence convertResultToString(Object obj) {
        return this.f3101a.mo1811b((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f3101a.mo1807a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
            filterResults.values = a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor a = this.f3101a.mo3045a();
        if (filterResults.values != null && filterResults.values != a) {
            this.f3101a.mo1809a((Cursor) filterResults.values);
        }
    }
}
