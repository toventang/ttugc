package com.bytedance.android.p150e.p151a.p152a;

import com.bytedance.android.p150e.p151a.p152a.C2726d;
import com.bytedance.covode.number.Covode;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: com.bytedance.android.e.a.a.f */
public final class C2730f {

    /* renamed from: a */
    public int f8137a = -1;

    /* renamed from: b */
    private C2726d.AbstractC2728b f8138b;

    /* renamed from: c */
    private long f8139c;

    /* renamed from: d */
    private long f8140d = Long.MAX_VALUE;

    /* renamed from: e */
    private int f8141e;

    /* renamed from: f */
    private int f8142f = 2;

    /* renamed from: g */
    private int f8143g = -1;

    /* renamed from: h */
    private long f8144h = -1;

    static {
        Covode.recordClassIndex(3156);
    }

    /* renamed from: c */
    public final byte[] mo7311c() {
        return this.f8138b.mo7302b(m7890j());
    }

    /* renamed from: d */
    public final String mo7312d() {
        return this.f8138b.mo7303c(m7890j());
    }

    /* renamed from: j */
    private long m7890j() {
        if (this.f8142f == 2) {
            long j = this.f8140d;
            long j2 = j - this.f8139c;
            this.f8142f = 6;
            this.f8139c = j;
            this.f8140d = this.f8144h;
            this.f8144h = -1;
            return j2;
        }
        throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.f8142f);
    }

    /* renamed from: a */
    public final long mo7307a() {
        if (this.f8142f == 2) {
            int i = this.f8141e + 1;
            this.f8141e = i;
            if (i <= 65) {
                long j = this.f8144h;
                this.f8144h = -1;
                this.f8142f = 6;
                return j;
            }
            throw new IOException("Wire recursion limit exceeded");
        }
        throw new IllegalStateException("Unexpected call to beginMessage()");
    }

    /* renamed from: e */
    public final int mo7313e() {
        int i = this.f8142f;
        if (i == 0 || i == 2) {
            int i2 = m7889i();
            m7888b(0);
            return i2;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f8142f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo7315g() {
        int i = this.f8142f;
        if (i == 5 || i == 2) {
            this.f8139c += 4;
            int c = this.f8138b.mo7305c();
            m7888b(5);
            return c;
        }
        throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.f8142f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final long mo7316h() {
        int i = this.f8142f;
        if (i == 1 || i == 2) {
            this.f8139c += 8;
            long d = this.f8138b.mo7306d();
            m7888b(1);
            return d;
        }
        throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.f8142f);
    }

    /* renamed from: i */
    private int m7889i() {
        int i;
        this.f8139c++;
        byte b = this.f8138b.mo7301b();
        if (b >= 0) {
            return b;
        }
        int i2 = b & Byte.MAX_VALUE;
        this.f8139c++;
        byte b2 = this.f8138b.mo7301b();
        if (b2 >= 0) {
            i = b2 << 7;
        } else {
            i2 |= (b2 & Byte.MAX_VALUE) << 7;
            this.f8139c++;
            byte b3 = this.f8138b.mo7301b();
            if (b3 >= 0) {
                i = b3 << 14;
            } else {
                i2 |= (b3 & Byte.MAX_VALUE) << 14;
                this.f8139c++;
                byte b4 = this.f8138b.mo7301b();
                if (b4 >= 0) {
                    i = b4 << 21;
                } else {
                    this.f8139c++;
                    byte b5 = this.f8138b.mo7301b();
                    int i3 = i2 | ((b4 & Byte.MAX_VALUE) << 21) | (b5 << 28);
                    if (b5 >= 0) {
                        return i3;
                    }
                    int i4 = 0;
                    do {
                        this.f8139c++;
                        if (this.f8138b.mo7301b() >= 0) {
                            return i3;
                        }
                        i4++;
                    } while (i4 < 5);
                    throw new ProtocolException("Malformed VARINT");
                }
            }
        }
        return i2 | i;
    }

    /* renamed from: f */
    public final long mo7314f() {
        int i = this.f8142f;
        if (i == 0 || i == 2) {
            long j = 0;
            int i2 = 0;
            do {
                this.f8139c++;
                byte b = this.f8138b.mo7301b();
                j |= ((long) (b & Byte.MAX_VALUE)) << i2;
                if ((b & 128) == 0) {
                    m7888b(0);
                    return j;
                }
                i2 += 7;
            } while (i2 < 64);
            throw new ProtocolException("WireInput encountered a malformed varint");
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f8142f);
    }

    /* renamed from: b */
    public final int mo7310b() {
        int i = this.f8142f;
        if (i == 7) {
            this.f8142f = 2;
            return this.f8143g;
        } else if (i == 6) {
            while (this.f8139c < this.f8140d && this.f8138b.mo7300a()) {
                int i2 = m7889i();
                if (i2 != 0) {
                    int i3 = i2 >> 3;
                    this.f8143g = i3;
                    int i4 = i2 & 7;
                    if (i4 == 0) {
                        this.f8137a = 0;
                        this.f8142f = 0;
                        return i3;
                    } else if (i4 == 1) {
                        this.f8137a = 1;
                        this.f8142f = 1;
                        return i3;
                    } else if (i4 == 2) {
                        this.f8137a = 2;
                        this.f8142f = 2;
                        int i5 = m7889i();
                        if (i5 < 0) {
                            throw new ProtocolException("Negative length: ".concat(String.valueOf(i5)));
                        } else if (this.f8144h == -1) {
                            long j = this.f8140d;
                            this.f8144h = j;
                            long j2 = this.f8139c + ((long) i5);
                            this.f8140d = j2;
                            if (j2 <= j) {
                                return this.f8143g;
                            }
                            throw new EOFException();
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (i4 == 3) {
                        m7887a(i3);
                    } else if (i4 == 4) {
                        throw new ProtocolException("Unexpected end group");
                    } else if (i4 == 5) {
                        this.f8137a = 5;
                        this.f8142f = 5;
                        return i3;
                    } else {
                        throw new ProtocolException("Unexpected field encoding: ".concat(String.valueOf(i4)));
                    }
                } else {
                    throw new ProtocolException("Unexpected tag 0");
                }
            }
            return -1;
        } else {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
    }

    /* renamed from: a */
    public final C2730f mo7308a(C2726d.AbstractC2728b bVar) {
        this.f8138b = bVar;
        this.f8139c = 0;
        this.f8140d = Long.MAX_VALUE;
        this.f8141e = 0;
        this.f8142f = 2;
        this.f8143g = -1;
        this.f8144h = -1;
        this.f8137a = -1;
        return this;
    }

    /* renamed from: a */
    private void m7887a(int i) {
        while (this.f8139c < this.f8140d && this.f8138b.mo7300a()) {
            int i2 = m7889i();
            if (i2 != 0) {
                int i3 = i2 >> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    this.f8142f = 0;
                    mo7314f();
                } else if (i4 == 1) {
                    this.f8142f = 1;
                    mo7316h();
                } else if (i4 == 2) {
                    long i5 = (long) m7889i();
                    this.f8139c += i5;
                    this.f8138b.mo7299a(i5);
                } else if (i4 == 3) {
                    m7887a(i3);
                } else if (i4 != 4) {
                    if (i4 == 5) {
                        this.f8142f = 5;
                        mo7315g();
                    } else {
                        throw new ProtocolException("Unexpected field encoding: ".concat(String.valueOf(i4)));
                    }
                } else if (i3 != i) {
                    throw new ProtocolException("Unexpected end group");
                } else {
                    return;
                }
            } else {
                throw new ProtocolException("Unexpected tag 0");
            }
        }
        throw new EOFException();
    }

    /* renamed from: b */
    private void m7888b(int i) {
        if (this.f8142f == i) {
            this.f8142f = 6;
            return;
        }
        long j = this.f8139c;
        long j2 = this.f8140d;
        if (j > j2) {
            throw new IOException("Expected to end at " + this.f8140d + " but was " + this.f8139c);
        } else if (j == j2) {
            this.f8140d = this.f8144h;
            this.f8144h = -1;
            this.f8142f = 6;
        } else {
            this.f8142f = 7;
        }
    }

    /* renamed from: a */
    public final void mo7309a(long j) {
        if (this.f8142f == 6) {
            int i = this.f8141e - 1;
            this.f8141e = i;
            if (i < 0 || this.f8144h != -1) {
                throw new IllegalStateException("No corresponding call to beginMessage()");
            } else if (this.f8139c == this.f8140d || i == 0) {
                this.f8140d = j;
            } else {
                throw new IOException("Expected to end at " + this.f8140d + " but was " + this.f8139c);
            }
        } else {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
    }
}
