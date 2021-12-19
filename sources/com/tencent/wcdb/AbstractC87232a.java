package com.tencent.wcdb;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObservable;
import android.database.ContentObserver;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.tencent.wcdb.support.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.wcdb.a */
public abstract class AbstractC87232a implements AbstractC87235c {

    /* renamed from: a */
    protected HashMap<Long, Map<String, Object>> f197585a = new HashMap<>();

    /* renamed from: b */
    protected int f197586b = -1;

    /* renamed from: c */
    protected int f197587c = -1;

    /* renamed from: d */
    protected Long f197588d = null;

    /* renamed from: e */
    protected boolean f197589e;

    /* renamed from: f */
    protected ContentResolver f197590f;

    /* renamed from: g */
    final Object f197591g = new Object();

    /* renamed from: h */
    final ContentObservable f197592h = new ContentObservable();

    /* renamed from: i */
    private Uri f197593i;

    /* renamed from: j */
    private ContentObserver f197594j;

    /* renamed from: k */
    private boolean f197595k;

    /* renamed from: l */
    private final DataSetObservable f197596l = new DataSetObservable();

    /* renamed from: m */
    private Bundle f197597m = Bundle.EMPTY;

    static {
        Covode.recordClassIndex(103089);
    }

    /* renamed from: a */
    public boolean mo141118a(int i) {
        return true;
    }

    public abstract String[] getColumnNames();

    @Override // com.tencent.wcdb.AbstractC87236d
    public abstract int getCount();

    @Override // com.tencent.wcdb.AbstractC87236d
    public abstract long getLong(int i);

    @Override // com.tencent.wcdb.AbstractC87236d
    public abstract String getString(int i);

    public int getType(int i) {
        return 3;
    }

    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    public void deactivate() {
        mo141117a();
    }

    public Bundle getExtras() {
        return this.f197597m;
    }

    public Uri getNotificationUri() {
        return this.f197593i;
    }

    public final int getPosition() {
        return this.f197586b;
    }

    public boolean isClosed() {
        return this.f197589e;
    }

    public int getColumnCount() {
        return getColumnNames().length;
    }

    @Override // com.tencent.wcdb.AbstractC87236d
    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    @Override // java.io.Closeable, com.tencent.wcdb.AbstractC87236d, java.lang.AutoCloseable
    public void close() {
        this.f197589e = true;
        this.f197592h.unregisterAll();
        mo141117a();
    }

    public final boolean isBeforeFirst() {
        if (getCount() == 0 || this.f197586b == -1) {
            return true;
        }
        return false;
    }

    public final boolean isFirst() {
        if (this.f197586b != 0 || getCount() == 0) {
            return false;
        }
        return true;
    }

    public final boolean isLast() {
        int count = getCount();
        if (this.f197586b != count - 1 || count == 0) {
            return false;
        }
        return true;
    }

    public final boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    @Override // com.tencent.wcdb.AbstractC87236d
    public final boolean moveToNext() {
        return moveToPosition(this.f197586b + 1);
    }

    public final boolean moveToPrevious() {
        return moveToPosition(this.f197586b - 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo141117a() {
        ContentObserver contentObserver = this.f197594j;
        if (contentObserver != null) {
            this.f197590f.unregisterContentObserver(contentObserver);
            this.f197595k = false;
        }
        this.f197596l.notifyInvalidated();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo141119b() {
        if (-1 == this.f197586b || getCount() == this.f197586b) {
            throw new C87263e(this.f197586b, getCount());
        }
    }

    @Override // java.lang.Object
    public void finalize() {
        ContentObserver contentObserver = this.f197594j;
        if (contentObserver != null && this.f197595k) {
            this.f197590f.unregisterContentObserver(contentObserver);
        }
        try {
            if (!this.f197589e) {
                close();
            }
        } catch (Exception unused) {
        }
    }

    public final boolean isAfterLast() {
        if (getCount() == 0 || this.f197586b == getCount()) {
            return true;
        }
        return false;
    }

    public boolean requery() {
        ContentObserver contentObserver = this.f197594j;
        if (contentObserver != null && !this.f197595k) {
            this.f197590f.registerContentObserver(this.f197593i, true, contentObserver);
            this.f197595k = true;
        }
        this.f197596l.notifyChanged();
        return true;
    }

    public Bundle respond(Bundle bundle) {
        return Bundle.EMPTY;
    }

    public byte[] getBlob(int i) {
        throw new UnsupportedOperationException("getBlob is not supported");
    }

    public String getColumnName(int i) {
        return getColumnNames()[i];
    }

    public final boolean move(int i) {
        return moveToPosition(this.f197586b + i);
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        this.f197592h.registerObserver(contentObserver);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f197596l.registerObserver(dataSetObserver);
    }

    public void setExtras(Bundle bundle) {
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        this.f197597m = bundle;
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f197596l.unregisterObserver(dataSetObserver);
    }

    /* renamed from: com.tencent.wcdb.a$a */
    protected static class C87233a extends ContentObserver {

        /* renamed from: a */
        WeakReference<AbstractC87232a> f197598a;

        static {
            Covode.recordClassIndex(103090);
        }

        public final boolean deliverSelfNotifications() {
            return false;
        }

        public C87233a(AbstractC87232a aVar) {
            super(null);
            this.f197598a = new WeakReference<>(aVar);
        }

        public final void onChange(boolean z) {
            MethodCollector.m26663i(5617);
            AbstractC87232a aVar = this.f197598a.get();
            if (aVar != null) {
                synchronized (aVar.f197591g) {
                    try {
                        aVar.f197592h.dispatchChange(false);
                    } finally {
                        MethodCollector.m26664o(5617);
                    }
                }
                return;
            }
            MethodCollector.m26664o(5617);
        }
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        if (!this.f197589e) {
            this.f197592h.unregisterObserver(contentObserver);
        }
    }

    @Override // com.tencent.wcdb.AbstractC87236d
    public int getColumnIndex(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            Exception exc = new Exception();
            Log.m151458a("Cursor", "requesting column name with table name -- ".concat(String.valueOf(str)), exc);
            str = str.substring(lastIndexOf + 1);
        }
        String[] columnNames = getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (columnNames[i].equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist");
    }

    public boolean moveToPosition(int i) {
        int count = getCount();
        if (i >= count) {
            this.f197586b = count;
            return false;
        } else if (i < 0) {
            this.f197586b = -1;
            return false;
        } else if (i == this.f197586b) {
            return true;
        } else {
            mo141118a(i);
            this.f197586b = i;
            int i2 = this.f197587c;
            if (i2 != -1) {
                this.f197588d = Long.valueOf(getLong(i2));
            }
            return true;
        }
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        String string = getString(i);
        if (string != null) {
            char[] cArr = charArrayBuffer.data;
            if (cArr == null || cArr.length < string.length()) {
                charArrayBuffer.data = string.toCharArray();
            } else {
                string.getChars(0, string.length(), cArr, 0);
            }
            charArrayBuffer.sizeCopied = string.length();
            return;
        }
        charArrayBuffer.sizeCopied = 0;
    }

    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        synchronized (this.f197591g) {
            this.f197593i = uri;
            this.f197590f = contentResolver;
            ContentObserver contentObserver = this.f197594j;
            if (contentObserver != null) {
                contentResolver.unregisterContentObserver(contentObserver);
            }
            C87233a aVar = new C87233a(this);
            this.f197594j = aVar;
            this.f197590f.registerContentObserver(this.f197593i, true, aVar);
            this.f197595k = true;
        }
    }
}
