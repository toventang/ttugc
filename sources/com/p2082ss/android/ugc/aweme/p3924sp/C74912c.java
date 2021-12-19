package com.p2082ss.android.ugc.aweme.p3924sp;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: com.ss.android.ugc.aweme.sp.c */
public final class C74912c implements XmlSerializer {

    /* renamed from: a */
    private static final String[] f168388a = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};

    /* renamed from: b */
    private final char[] f168389b = new char[8192];

    /* renamed from: c */
    private int f168390c;

    /* renamed from: d */
    private Writer f168391d;

    /* renamed from: e */
    private OutputStream f168392e;

    /* renamed from: f */
    private CharsetEncoder f168393f;

    /* renamed from: g */
    private ByteBuffer f168394g = ByteBuffer.allocate(8192);

    /* renamed from: h */
    private boolean f168395h;

    @Override // org.xmlpull.v1.XmlSerializer
    public final void endDocument() {
        flush();
    }

    public final int getDepth() {
        throw new UnsupportedOperationException();
    }

    public final String getName() {
        throw new UnsupportedOperationException();
    }

    public final String getNamespace() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private void m131467a() {
        MethodCollector.m26663i(13930);
        int position = this.f168394g.position();
        if (position > 0) {
            this.f168394g.flip();
            this.f168392e.write(this.f168394g.array(), 0, position);
            this.f168394g.clear();
        }
        MethodCollector.m26664o(13930);
    }

    static {
        Covode.recordClassIndex(87777);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void flush() {
        MethodCollector.m26663i(13978);
        int i = this.f168390c;
        if (i > 0) {
            if (this.f168392e != null) {
                CharBuffer wrap = CharBuffer.wrap(this.f168389b, 0, i);
                CoderResult encode = this.f168393f.encode(wrap, this.f168394g, true);
                while (!encode.isError()) {
                    if (encode.isOverflow()) {
                        m131467a();
                        encode = this.f168393f.encode(wrap, this.f168394g, true);
                    } else {
                        m131467a();
                        this.f168392e.flush();
                    }
                }
                IOException iOException = new IOException(encode.toString());
                MethodCollector.m26664o(13978);
                throw iOException;
            }
            this.f168391d.write(this.f168389b, 0, i);
            this.f168391d.flush();
            this.f168390c = 0;
        }
        MethodCollector.m26664o(13978);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(Writer writer) {
        this.f168391d = writer;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void cdsect(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void comment(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void docdecl(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void entityRef(String str) {
        throw new UnsupportedOperationException();
    }

    public final boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    public final Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void ignorableWhitespace(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void processingInstruction(String str) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private void m131469a(String str) {
        m131470a(str, 0, str.length());
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(String str) {
        if (this.f168395h) {
            m131469a(">");
            this.f168395h = false;
        }
        m131472b(str);
        return this;
    }

    /* renamed from: a */
    private void m131468a(char c) {
        int i = this.f168390c;
        if (i >= 8191) {
            flush();
            i = this.f168390c;
        }
        this.f168389b[i] = c;
        this.f168390c = i + 1;
    }

    /* renamed from: b */
    private void m131472b(String str) {
        String str2;
        int length = str.length();
        String[] strArr = f168388a;
        char length2 = (char) strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < length2 && (str2 = strArr[charAt]) != null) {
                if (i2 < i) {
                    m131470a(str, i2, i - i2);
                }
                i2 = i + 1;
                m131469a(str2);
            }
            i++;
        }
        if (i2 < i) {
            m131470a(str, i2, i - i2);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getPrefix(String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setPrefix(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setProperty(String str, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setFeature(String str, boolean z) {
        if (!str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer startTag(String str, String str2) {
        if (this.f168395h) {
            m131469a(">\n");
        }
        m131468a('<');
        if (str != null) {
            m131469a(str);
            m131468a(':');
        }
        m131469a(str2);
        this.f168395h = true;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer endTag(String str, String str2) {
        if (this.f168395h) {
            m131469a(" />\n");
        } else {
            m131469a("</");
            if (str != null) {
                m131469a(str);
                m131468a(':');
            }
            m131469a(str2);
            m131469a(">\n");
        }
        this.f168395h = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(OutputStream outputStream, String str) {
        if (outputStream != null) {
            try {
                this.f168393f = Charset.forName(str).newEncoder();
                this.f168392e = outputStream;
            } catch (IllegalCharsetNameException e) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e));
            } catch (UnsupportedCharsetException e2) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e2));
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void startDocument(String str, Boolean bool) {
        String str2;
        StringBuilder sb = new StringBuilder("<?xml version='1.0' encoding='utf-8' standalone='");
        if (bool.booleanValue()) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        m131469a(sb.append(str2).append("' ?>\n").toString());
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer attribute(String str, String str2, String str3) {
        m131468a(' ');
        if (str != null) {
            m131469a(str);
            m131468a(':');
        }
        m131469a(str2);
        m131469a("=\"");
        m131472b(str3);
        m131468a('\"');
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(char[] cArr, int i, int i2) {
        String str;
        if (this.f168395h) {
            m131469a(">");
            this.f168395h = false;
        }
        String[] strArr = f168388a;
        char length = (char) strArr.length;
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            char c = cArr[i];
            if (c < length && (str = strArr[c]) != null) {
                if (i4 < i) {
                    m131471a(cArr, i4, i - i4);
                }
                i4 = i + 1;
                m131469a(str);
            }
            i++;
        }
        if (i4 < i) {
            m131471a(cArr, i4, i - i4);
        }
        return this;
    }

    /* renamed from: a */
    private void m131470a(String str, int i, int i2) {
        int i3;
        if (i2 > 8192) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = i + 8192;
                if (i5 < i4) {
                    i3 = 8192;
                } else {
                    i3 = i4 - i;
                }
                m131470a(str, i, i3);
                i = i5;
            }
            return;
        }
        int i6 = this.f168390c;
        if (i6 + i2 > 8192) {
            flush();
            i6 = this.f168390c;
        }
        str.getChars(i, i + i2, this.f168389b, i6);
        this.f168390c = i6 + i2;
    }

    /* renamed from: a */
    private void m131471a(char[] cArr, int i, int i2) {
        int i3;
        if (i2 > 8192) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = i + 8192;
                if (i5 < i4) {
                    i3 = 8192;
                } else {
                    i3 = i4 - i;
                }
                m131471a(cArr, i, i3);
                i = i5;
            }
            return;
        }
        int i6 = this.f168390c;
        if (i6 + i2 > 8192) {
            flush();
            i6 = this.f168390c;
        }
        System.arraycopy(cArr, i, this.f168389b, i6, i2);
        this.f168390c = i6 + i2;
    }
}
