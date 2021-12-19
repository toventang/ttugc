package com.squareup.wire;

import com.bytedance.covode.number.Covode;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import p4632k.AbstractC89426h;
import p4632k.C89427i;

public final class ProtoReader {
    private long limit = Long.MAX_VALUE;
    private FieldEncoding nextFieldEncoding;
    private long pos;
    private long pushedLimit = -1;
    private int recursionDepth;
    private final AbstractC89426h source;
    private int state = 2;
    private int tag = -1;

    static {
        Covode.recordClassIndex(35703);
    }

    public final FieldEncoding peekFieldEncoding() {
        return this.nextFieldEncoding;
    }

    public final C89427i readBytes() {
        long beforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.mo143813d(beforeLengthDelimitedScalar);
        return this.source.mo143823g(beforeLengthDelimitedScalar);
    }

    public final String readString() {
        long beforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.mo143813d(beforeLengthDelimitedScalar);
        return this.source.mo143825h(beforeLengthDelimitedScalar);
    }

    private long beforeLengthDelimitedScalar() {
        if (this.state == 2) {
            long j = this.limit - this.pos;
            this.source.mo143813d(j);
            this.state = 6;
            this.pos = this.limit;
            this.limit = this.pushedLimit;
            this.pushedLimit = -1;
            return j;
        }
        throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.state);
    }

    public final long beginMessage() {
        if (this.state == 2) {
            int i = this.recursionDepth + 1;
            this.recursionDepth = i;
            if (i <= 65) {
                long j = this.pushedLimit;
                this.pushedLimit = -1;
                this.state = 6;
                return j;
            }
            throw new IOException("Wire recursion limit exceeded");
        }
        throw new IllegalStateException("Unexpected call to beginMessage()");
    }

    public final int readFixed32() {
        int i = this.state;
        if (i == 5 || i == 2) {
            this.source.mo143813d(4);
            this.pos += 4;
            int m = this.source.mo143839m();
            afterPackableScalar(5);
            return m;
        }
        throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.state);
    }

    public final long readFixed64() {
        int i = this.state;
        if (i == 1 || i == 2) {
            this.source.mo143813d(8);
            this.pos += 8;
            long n = this.source.mo143841n();
            afterPackableScalar(1);
            return n;
        }
        throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.state);
    }

    public final int readVarint32() {
        int i = this.state;
        if (i == 0 || i == 2) {
            int internalReadVarint32 = internalReadVarint32();
            afterPackableScalar(0);
            return internalReadVarint32;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
    }

    public final void skip() {
        int i = this.state;
        if (i == 0) {
            readVarint64();
        } else if (i == 1) {
            readFixed64();
        } else if (i == 2) {
            this.source.mo143838l(beforeLengthDelimitedScalar());
        } else if (i == 5) {
            readFixed32();
        } else {
            throw new IllegalStateException("Unexpected call to skip()");
        }
    }

    public final long readVarint64() {
        int i = this.state;
        if (i == 0 || i == 2) {
            long j = 0;
            int i2 = 0;
            do {
                this.source.mo143813d(1);
                this.pos++;
                byte h = this.source.mo143824h();
                j |= ((long) (h & Byte.MAX_VALUE)) << i2;
                if ((h & 128) == 0) {
                    afterPackableScalar(0);
                    return j;
                }
                i2 += 7;
            } while (i2 < 64);
            throw new ProtocolException("WireInput encountered a malformed varint");
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
    }

    private int internalReadVarint32() {
        int i;
        this.source.mo143813d(1);
        this.pos++;
        byte h = this.source.mo143824h();
        if (h >= 0) {
            return h;
        }
        int i2 = h & Byte.MAX_VALUE;
        this.source.mo143813d(1);
        this.pos++;
        byte h2 = this.source.mo143824h();
        if (h2 >= 0) {
            i = h2 << 7;
        } else {
            i2 |= (h2 & Byte.MAX_VALUE) << 7;
            this.source.mo143813d(1);
            this.pos++;
            byte h3 = this.source.mo143824h();
            if (h3 >= 0) {
                i = h3 << 14;
            } else {
                i2 |= (h3 & Byte.MAX_VALUE) << 14;
                this.source.mo143813d(1);
                this.pos++;
                byte h4 = this.source.mo143824h();
                if (h4 >= 0) {
                    i = h4 << 21;
                } else {
                    this.source.mo143813d(1);
                    this.pos++;
                    byte h5 = this.source.mo143824h();
                    int i3 = i2 | ((h4 & Byte.MAX_VALUE) << 21) | (h5 << 28);
                    if (h5 >= 0) {
                        return i3;
                    }
                    int i4 = 0;
                    do {
                        this.source.mo143813d(1);
                        this.pos++;
                        if (this.source.mo143824h() >= 0) {
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

    public final int nextTag() {
        int i = this.state;
        if (i == 7) {
            this.state = 2;
            return this.tag;
        } else if (i == 6) {
            while (this.pos < this.limit && !this.source.mo143815e()) {
                int internalReadVarint32 = internalReadVarint32();
                if (internalReadVarint32 != 0) {
                    int i2 = internalReadVarint32 >> 3;
                    this.tag = i2;
                    int i3 = internalReadVarint32 & 7;
                    if (i3 == 0) {
                        this.nextFieldEncoding = FieldEncoding.VARINT;
                        this.state = 0;
                        return this.tag;
                    } else if (i3 == 1) {
                        this.nextFieldEncoding = FieldEncoding.FIXED64;
                        this.state = 1;
                        return this.tag;
                    } else if (i3 == 2) {
                        this.nextFieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                        this.state = 2;
                        int internalReadVarint322 = internalReadVarint32();
                        if (internalReadVarint322 < 0) {
                            throw new ProtocolException("Negative length: ".concat(String.valueOf(internalReadVarint322)));
                        } else if (this.pushedLimit == -1) {
                            long j = this.limit;
                            this.pushedLimit = j;
                            long j2 = this.pos + ((long) internalReadVarint322);
                            this.limit = j2;
                            if (j2 <= j) {
                                return this.tag;
                            }
                            throw new EOFException();
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (i3 == 3) {
                        skipGroup(i2);
                    } else if (i3 == 4) {
                        throw new ProtocolException("Unexpected end group");
                    } else if (i3 == 5) {
                        this.nextFieldEncoding = FieldEncoding.FIXED32;
                        this.state = 5;
                        return this.tag;
                    } else {
                        throw new ProtocolException("Unexpected field encoding: ".concat(String.valueOf(i3)));
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

    public ProtoReader(AbstractC89426h hVar) {
        this.source = hVar;
    }

    private void afterPackableScalar(int i) {
        if (this.state == i) {
            this.state = 6;
            return;
        }
        long j = this.pos;
        long j2 = this.limit;
        if (j > j2) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        } else if (j == j2) {
            this.limit = this.pushedLimit;
            this.pushedLimit = -1;
            this.state = 6;
        } else {
            this.state = 7;
        }
    }

    private void skipGroup(int i) {
        while (this.pos < this.limit && !this.source.mo143815e()) {
            int internalReadVarint32 = internalReadVarint32();
            if (internalReadVarint32 != 0) {
                int i2 = internalReadVarint32 >> 3;
                int i3 = internalReadVarint32 & 7;
                if (i3 == 0) {
                    this.state = 0;
                    readVarint64();
                } else if (i3 == 1) {
                    this.state = 1;
                    readFixed64();
                } else if (i3 == 2) {
                    long internalReadVarint322 = (long) internalReadVarint32();
                    this.pos += internalReadVarint322;
                    this.source.mo143838l(internalReadVarint322);
                } else if (i3 == 3) {
                    skipGroup(i2);
                } else if (i3 != 4) {
                    if (i3 == 5) {
                        this.state = 5;
                        readFixed32();
                    } else {
                        throw new ProtocolException("Unexpected field encoding: ".concat(String.valueOf(i3)));
                    }
                } else if (i2 != i) {
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

    public final void endMessage(long j) {
        if (this.state == 6) {
            int i = this.recursionDepth - 1;
            this.recursionDepth = i;
            if (i < 0 || this.pushedLimit != -1) {
                throw new IllegalStateException("No corresponding call to beginMessage()");
            } else if (this.pos == this.limit || i == 0) {
                this.limit = j;
            } else {
                throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
            }
        } else {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
    }
}
