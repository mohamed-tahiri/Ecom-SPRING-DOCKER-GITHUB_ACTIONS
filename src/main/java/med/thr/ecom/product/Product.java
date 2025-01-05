package med.thr.ecom.product;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import med.thr.ecom.cart.CartItem;
import med.thr.ecom.common.BaseEntity;
import med.thr.ecom.feedback.Feedback;
import med.thr.ecom.user.User;
import java.util.List;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends BaseEntity {

    private String name;
    private String description;
    private Double price;
    private boolean activated;
    private boolean shareable;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "product")
    private List<Feedback> feedbacks;

    @OneToMany(mappedBy = "product")
    private List<CartItem> items;

}
