package ca.yorku.eecs3311.roomscheduler;
import java.math.BigDecimal;
import java.util.Objects;
public final class RegisteredUser extends Account {
    RegisteredUser(String id, String name, String email, String passwordHash,
                   boolean universityVerified, boolean active) {
        super(id, name, email, passwordHash, Role.REGISTERED_USER, universityVerified, active);
        this.accountType = Objects.requireNonNull(accountType);
    }
    public AccountType accountType() {
        return accountType;
    }

    public BigDecimal hourlyRate() {
        return accountType.hourlyRate();
    }
}

