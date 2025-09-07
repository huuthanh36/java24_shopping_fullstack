package com.example.java24_shopping_backend.entity;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "T15_CUSTOMER")
@Data
public class Customer implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C15_CUSTOMER_ID")
    private Long id;

    @Column(name = "C15_CUSTOMER_NAME")
    private String name;

    @Column(name = "C15_CUSTOMER_EMAIL")
    private String email;

    @Column(name = "C15_CUSTOMER_ADDRESS")
    private String address;

    @Column(name = "C15_CUSTOMER_PHONE")
    private String phone;

    @Column(name = "C15_CUSTOMER_PASSWORD")
    private String password;

    @Column(name = "C15_GMAIL_TOKEN")
    private String gmailToken;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<DeliveryAddress> deliveryAddresses;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Cart> carts;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<CartLaterOn> cartLaterOns;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public String getPassword(){
        return password;
    }
}